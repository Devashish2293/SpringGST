package com.SpringGST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.SpringGST.Dao.ItemDAO;
import com.SpringGST.models.Business;
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
    Business customer1 = new Business("Arias Tech.");
    Business customer2 = new Business("Aztel Pvt. Ltd");
    Business customer3 = new Business("Syntech Pvt. Ltd");
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
  public ModelAndView newSalesInvoice(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException,ParseException {
	  Business customer1 = new Business("Arias Tech.");
	  Invoice invoice = new Invoice("MH39001",new SimpleDateFormat("dd/MM/yyyy").parse("22/5/2017") , new SimpleDateFormat("dd/MM/yyyy").parse("17/7/2017"), customer1, 455290.0);
	/*  msg.setInvoiceId("qwe123");
	  msg.setReference("moksh");*/
    logger.info("Return View");
    //String message ="Create Sales Invoice";
    return new ModelAndView("AddSalesInvoices" , "invoice" ,  invoice);
  }
  
  @RequestMapping(value="/save" , method=RequestMethod.POST)
  public String addInvoice(@ModelAttribute("invoice") Invoice invoice)
    throws ServletException, IOException,ParseException {
	 /* Business customer1 = new Business("Arias Tech.");
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