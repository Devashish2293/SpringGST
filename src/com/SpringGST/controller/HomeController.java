package com.SpringGST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.SpringGST.Dao.AddressDAO;
import com.SpringGST.Dao.ClientDAO;
import com.SpringGST.Dao.InvoiceDAO;
import com.SpringGST.Dao.InvoiceItemDAO;
import com.SpringGST.Dao.ItemDAO;
import com.SpringGST.FormObjects.ClientForm;
import com.SpringGST.FormObjects.InvoiceForm;
import com.SpringGST.models.Address;
import com.SpringGST.models.Client;
import com.SpringGST.models.Invoice;
import com.SpringGST.models.InvoiceItem;
import com.SpringGST.models.Item;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
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
  
  @RequestMapping("/invoice")
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, ParseException {
    logger.info("Return View");
    List<Invoice> invoiceList = invoiceDAO.getInvoiceList();
    
   /* Client client1 = new Client("Arias Tech.");
    Client client2 = new Client("Aztel Pvt. Ltd");
    Client client3 = new Client("Syntech Pvt. Ltd");
    Invoice invoice1 = new Invoice("MH39001",new SimpleDateFormat("dd/MM/yyyy").parse("22/5/2017") , new SimpleDateFormat("dd/MM/yyyy").parse("17/7/2017"), client1.getClientId(), 455290.0);
    Invoice invoice2 = new Invoice("MH39002",new SimpleDateFormat("dd/MM/yyyy").parse("22/5/2017") , new SimpleDateFormat("dd/MM/yyyy").parse("17/7/2017"), client2.getClientId(), 23466.0);
    Invoice invoice3 = new Invoice("MH39003",new SimpleDateFormat("dd/MM/yyyy").parse("22/5/2017") , new SimpleDateFormat("dd/MM/yyyy").parse("17/7/2017"), client3.getClientId(), 535290.0);
    Invoice invoice4 = new Invoice("MH39004",new SimpleDateFormat("dd/MM/yyyy").parse("22/5/2017") , new SimpleDateFormat("dd/MM/yyyy").parse("17/7/2017"), client2.getClientId(), 655290.0);
    invoiceList.add(invoice1);
    invoiceList.add(invoice2);
    invoiceList.add(invoice3);
    invoiceList.add(invoice4);*/
     
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
}