package com.SpringGST.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SpringGST.models.Business;
import com.SpringGST.models.Invoice;

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
}