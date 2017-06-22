package com.SpringGST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.SpringGST.Dao.ItemDAO;
import com.SpringGST.models.Address;
import com.SpringGST.models.Customer;
import com.SpringGST.models.Invoice;
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
  ItemDAO itemDAO;
  
  @RequestMapping("/invoice")
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, ParseException {
    logger.info("Return View");
    List<Invoice> invoiceList = new ArrayList();
    Customer customer1 = new Customer("Arias Tech.");
    Customer customer2 = new Customer("Aztel Pvt. Ltd");
    Customer customer3 = new Customer("Syntech Pvt. Ltd");
    Invoice invoice1 = new Invoice("MH39001",new SimpleDateFormat("dd/MM/yyyy").parse("22/5/2017") , new SimpleDateFormat("dd/MM/yyyy").parse("17/7/2017"), customer1, 455290.0);
    Invoice invoice2 = new Invoice("MH39002",new SimpleDateFormat("dd/MM/yyyy").parse("22/5/2017") , new SimpleDateFormat("dd/MM/yyyy").parse("17/7/2017"), customer2, 23466.0);
    Invoice invoice3 = new Invoice("MH39003",new SimpleDateFormat("dd/MM/yyyy").parse("22/5/2017") , new SimpleDateFormat("dd/MM/yyyy").parse("17/7/2017"), customer3, 535290.0);
    Invoice invoice4 = new Invoice("MH39004",new SimpleDateFormat("dd/MM/yyyy").parse("22/5/2017") , new SimpleDateFormat("dd/MM/yyyy").parse("17/7/2017"), customer2, 655290.0);
    invoiceList.add(invoice1);
    invoiceList.add(invoice2);
    invoiceList.add(invoice3);
    invoiceList.add(invoice4);
    return new ModelAndView("SalesInvoices" , "invoiceList" ,  invoiceList);
  }
  
  @RequestMapping("/addinvoice")
  public String newSalesInvoice(Model model)
    throws ServletException, IOException,ParseException {
	  Customer customer1 = new Customer("Arias Tech.");
	  Invoice invoice = new Invoice("MH39001",new SimpleDateFormat("dd/MM/yyyy").parse("22/5/2017") , new SimpleDateFormat("dd/MM/yyyy").parse("17/7/2017"), customer1, 455290.0);
	/*  msg.setInvoiceId("qwe123");
	  msg.setReference("moksh");*/
    logger.info("Return View");
    Customer newCustomer = new Customer(new Address());
    Item newItem = new Item();
    
    model.addAttribute("newCustomer",newCustomer);
    model.addAttribute("invoice" ,  invoice);
    model.addAttribute("newItem", newItem);
    
    //String message ="Create Sales Invoice";
    return "AddSalesInvoices" ;
  }
  
  @RequestMapping(value = "/addCustomer" , method = RequestMethod.POST)
  public String addCustomer(@ModelAttribute("newCustomer") Customer customer){
	 
	  System.out.println(customer.getBusinessName());
	
	 
	  return "redirect:/addinvoice";
  }
  
  @RequestMapping(value = "/addinvoice/addItem" , method = RequestMethod.POST)
  public String addSalesItem(@ModelAttribute("newItem") Item item ,Model model){
	 Invoice invoice=new Invoice();
	 Customer newCustomer = new Customer();
	  System.out.println(item.getItemDescription());
	  itemDAO.addItem(item);
	model.addAttribute("newCustomer",newCustomer);
		model.addAttribute("invoice" ,  invoice);
	  model.addAttribute("newItem", item);
	 
	  //return "AddSalesInvoices" ;
	  return "redirect:/addinvoice";
  }
  
  @RequestMapping(value="/save" , method=RequestMethod.POST)
  public String addInvoice(@ModelAttribute("invoice") Invoice invoice)
    throws ServletException, IOException,ParseException {
	 /* Customer customer1 = new Customer("Arias Tech.");
	  Invoice msg = new Invoice("MH39001",new SimpleDateFormat("dd/MM/yyyy").parse("22/5/2017") , new SimpleDateFormat("dd/MM/yyyy").parse("17/7/2017"), customer1, 455290.0);*/
	/*  msg.setInvoiceId("qwe123");
	  msg.setReference("moksh");*/
   /* logger.info("Return View");*/
    //String message ="Create Sales Invoice";
	  System.out.println("Inoice Id : " + invoice.getInvoiceId());
	  System.out.println("gstIN(Qty):" + invoice.getGstIN());
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