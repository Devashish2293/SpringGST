package com.gst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gst.Dao.AddressDAO;
import com.gst.Dao.ClientDAO;
import com.gst.Dao.InvoiceDAO;
import com.gst.Dao.InvoiceItemDAO;
import com.gst.Dao.ItemDAO;
import com.gst.Dao.PortalUserDAO;
import com.gst.FormObjects.ClientForm;
import com.gst.FormObjects.InvoiceForm;
import com.gst.Services.GetVendorInvoicesDetails;
import com.gst.models.Address;
import com.gst.models.Client;
import com.gst.models.Invoice;
import com.gst.models.InvoiceItem;
import com.gst.models.Item;
import com.gst.models.Login;
import com.gst.models.PortalUser;
import com.gst.models.ReconciledData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {
  protected final Log logger = LogFactory.getLog(getClass());

  @Autowired
  private ItemDAO itemDAO;
  @Autowired
  private ClientDAO clientDAO;
  @Autowired
  private AddressDAO addressDAO;
  @Autowired
  private InvoiceDAO invoiceDAO;
  
  @Autowired
  private InvoiceItemDAO invoiceItemDAO;
  @Autowired
  private PortalUserDAO poratlUserDAO;
  
  @RequestMapping("/invoice")
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, ParseException {
    logger.info("Return View");
    List<Invoice> invoiceList = invoiceDAO.getInvoiceList();  
    return new ModelAndView("SalesInvoices" , "invoiceList" ,  invoiceList);
  }
  
  @RequestMapping("/addinvoice")
  public String newSalesInvoice(Model model)
    throws ServletException, IOException,ParseException {
	  InvoiceForm invoiceForm = new InvoiceForm(new Invoice() , new Client() , new InvoiceItem() );
	  
	  Client client1 = new Client("Arias Tech.");
	  Invoice invoice = new Invoice("MH39001",new SimpleDateFormat("dd/MM/yyyy").parse("22/5/2017") , new SimpleDateFormat("dd/MM/yyyy").parse("17/7/2017"), client1.getClientId(), 455290.0);
	  
	  /*  msg.setInvoiceId("qwe123");
	  msg.setReference("moksh");*/
    logger.info("Return View");
    ClientForm newClient = new ClientForm(new Client(), new Address());
    List<Client> clientList = clientDAO.getClientList();
    List<Item> itemList = itemDAO.getItemList();
    Item newItem = new Item();
    
    model.addAttribute("newClient",newClient);
    model.addAttribute("invoiceForm", invoiceForm);
    model.addAttribute("invoice" ,  invoice);
    model.addAttribute("newItem", newItem);
    model.addAttribute("clientList",clientList);
    model.addAttribute("itemList",itemList);

    
    
    
    //String message ="Create Sales Invoice";
    return "AddSalesInvoices" ;
  }
  
  @RequestMapping(value = "/addinvoice/addClient" , method = RequestMethod.POST)
  public String addClient(@ModelAttribute("newClient") ClientForm clientForm){
	  String addressId;
	  System.out.println(clientForm.getClient().getBusinessName());
	  addressId = addressDAO.addAddress(clientForm.getAddress());
	  clientForm.getClient().setBillingAddress(addressId);
	  clientForm.getClient().setShippingAddress(addressId);
      clientDAO.addClient(clientForm.getClient());

	  return "redirect:/addinvoice";
  }
  
  @RequestMapping(value = "/addinvoice/addItem" , method = RequestMethod.POST)
  public String addSalesItem(@ModelAttribute("newItem") Item item ,Model model){
	 Invoice invoice=new Invoice();
	 Client newclient = new Client();
	  System.out.println(item.getItemDescription());
	  itemDAO.addItem(item);
	model.addAttribute("newclient",newclient);
		model.addAttribute("invoice" ,  invoice);
	  model.addAttribute("newItem", item);
	 
	  //return "AddSalesInvoices" ;
	  return "redirect:/addinvoice";
  }
  
  @RequestMapping(value="/save" , method=RequestMethod.POST)
  public String addInvoice(@ModelAttribute("invoiceForm") @Validated InvoiceForm invoiceForm)
    throws ServletException, IOException,ParseException {
	 /* client client1 = new client("Arias Tech.");
	  Invoice msg = new Invoice("MH39001",new SimpleDateFormat("dd/MM/yyyy").parse("22/5/2017") , new SimpleDateFormat("dd/MM/yyyy").parse("17/7/2017"), client1, 455290.0);*/
	/*  msg.setInvoiceId("qwe123");
	  msg.setReference("moksh");*/
   /* logger.info("Return View");*/
    //String message ="Create Sales Invoice";
	  Invoice invoice = new Invoice();
	  InvoiceItem invoiceItem = new InvoiceItem();
	  Client client = clientDAO.getClientFromId(invoiceForm.getClient().getClientId());
	  Address address = addressDAO.getAddress(client.getBillingAddress());
	  invoice.setClientId(invoiceForm.getClient().getClientId());
	  invoice.setPlaceOfSupply(address.getState());
	  invoice.setInvoiceType(client.getIsBusiness()?"B2B":"B2C");
	  String invoiceID = invoiceDAO.addInvoice(invoice);
	  invoiceItem = invoiceForm.getInvoiceItem();
	  invoiceItem.setInvoiceId(invoiceID);
	  invoiceItemDAO.addInvoiceItem(invoiceItem);
	  
	  
    return "redirect:/invoice";
  }
  
  @RequestMapping("/items")
  public String getItemsPage(Model model){
	  Item newItem = new Item();
	  List<Item> itemList = itemDAO.getItemList();
	  model.addAttribute("itemList",itemList);
	  model.addAttribute("newItem",newItem);

	  return "Items";
  }
  @RequestMapping(value = "/items/addItem" , method = RequestMethod.POST)
  public String addItem(@ModelAttribute("newItem") Item item){
	 
	  System.out.println(item.getHSN() + item.getItemDescription());
	  itemDAO.addItem(item);
	 
	  return "redirect:/items";
  }
  
  @RequestMapping("/registration")
  public ModelAndView handleRegistrationRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    logger.info("Return View");
    String message ="Welcome to GST Site";
    return new ModelAndView("Registration", "portaluser",new PortalUser());
  }
  
  @RequestMapping(value = "/submit" , method = RequestMethod.POST)
  public String addPortalUser(@ModelAttribute("portaluser") PortalUser user){
	  poratlUserDAO.addPortalUser(user);
	  logger.info(user);
	  return "redirect:/login";
  }
  @RequestMapping("/login")
  public ModelAndView handleLoginRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    logger.info("Return View");
   // String message ="Welcome to GST Site";
    return new ModelAndView("Login", "login",new PortalUser());
  }

  @RequestMapping(value="/login_submit", method=RequestMethod.POST)
  public ModelAndView handleLoginSubmitRequest(@ModelAttribute("login") Login login)
    throws ServletException, IOException {
    logger.info("Return View");
    logger.info(login.toString());
   // String message ="Welcome to GST Site";
    ModelAndView modelAndView = null;
    boolean isAuthenticated = poratlUserDAO.authenticate(login.getEmail(), login.getPassword());
    ArrayList<String> arrayList = new ArrayList<String>();
    if(isAuthenticated){
    	modelAndView = new ModelAndView("invoice");
    	arrayList.add("logged in successfully");
        modelAndView.addObject("my_messages",arrayList);
    } else {
    	modelAndView =  new ModelAndView("Login");
    	arrayList.add("wrong creds");
    	modelAndView.addObject("my_errors",arrayList);
    }
    logger.info(modelAndView.toString());
    return modelAndView;
  }
  
  

  @RequestMapping("/matchData")
  public ModelAndView viewData(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, ParseException {
    logger.info("Return View");
    List<ReconciledData> reconDataList = new ArrayList();   
      ReconciledData data1 = new ReconciledData("20","0","20" , "Rs. 80,772.00", "Rs. 1,80,189.00","Rs. 1,80,189.00","Rs. 31,16,350.00");      
      reconDataList.add(data1);
    return new ModelAndView("ReconcileData" , "reconDataList" ,  reconDataList);
  }
  
  @RequestMapping("/vendorInvoicesData")
  public ModelAndView showVendorInvoicesData(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, ParseException {
    logger.info("Return View");
    //List<ReconciledData> reconDataList = new ArrayList();   
      //ReconciledData data1 = new ReconciledData("20","0","20" , "Rs. 80,772.00", "Rs. 1,80,189.00","Rs. 1,80,189.00","Rs. 31,16,350.00");      
     // reconDataList.add(data1);
    return new ModelAndView("VendorInvoicesDetails" , "" ,  "");
  }
  @RequestMapping("/viewMyData")
  public ModelAndView showMyInvoicesData(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, ParseException {
    logger.info("Return View");
    //List<ReconciledData> reconDataList = new ArrayList();   
      //ReconciledData data1 = new ReconciledData("20","0","20" , "Rs. 80,772.00", "Rs. 1,80,189.00","Rs. 1,80,189.00","Rs. 31,16,350.00");      
     // reconDataList.add(data1);
    return new ModelAndView("ViewMyInvoicesData" , "" ,  "");
  }
  
  @RequestMapping("/claimCredit")
  public ModelAndView claimITCredit(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, ParseException {
    logger.info("Return View");
    //List<ReconciledData> reconDataList = new ArrayList();   
      //ReconciledData data1 = new ReconciledData("20","0","20" , "Rs. 80,772.00", "Rs. 1,80,189.00","Rs. 1,80,189.00","Rs. 31,16,350.00");      
     // reconDataList.add(data1);
    return new ModelAndView("ClaimITC" , "" ,  "");
  }
  
  
  @RequestMapping("/fileGSTR2")
  public ModelAndView fileGSTR2Summary(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, ParseException {
    logger.info("Return View");
    //List<ReconciledData> reconDataList = new ArrayList();   
      //ReconciledData data1 = new ReconciledData("20","0","20" , "Rs. 80,772.00", "Rs. 1,80,189.00","Rs. 1,80,189.00","Rs. 31,16,350.00");      
     // reconDataList.add(data1);
    return new ModelAndView("GSTR2FillingSummary" , "" ,  "");
  }
  
  
  @RequestMapping("/downloadVendorInvoicesFromGSTN")
  public ModelAndView downloadVendorInvoices(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, ParseException {
System.out.println("IN DOWNLOADING DATA FROM GSTN !!!!!!!!!");
//GSTIN of the taxpayer  -- mandatory
//Return Period	MMYYYY   --MMYYYY  -- mandatory
//action_required  ---not mandatory
//Counter party GSTIN  ---not mandatory
//from_time  --- not mandatory
String taxpayerGSTIN = "";
String ret_period = "072016";

GetVendorInvoicesDetails vendorIncoices= new GetVendorInvoicesDetails();
try {
	vendorIncoices.getVendorInvoicesDetails(taxpayerGSTIN,ret_period);
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	 
	    //List<ReconciledData> reconDataList = new ArrayList();   
	      //ReconciledData data1 = new ReconciledData("20","0","20" , "Rs. 80,772.00", "Rs. 1,80,189.00","Rs. 1,80,189.00","Rs. 31,16,350.00");      
	     // reconDataList.add(data1);
System.out.println("********** returning view *************");
	    return new ModelAndView("VendorInvoicesDetails" , "" ,  "");
  
  }
}