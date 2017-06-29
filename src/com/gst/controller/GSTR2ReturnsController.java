package com.gst.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gst.models.GSTR2Summary;


@Controller
public class GSTR2ReturnsController {

	protected final Log logger = LogFactory.getLog(getClass());


	
	
	/////////////////////////////////////////////////////////////////////////////
	//GSTR2
	///////////////////////////////////////////////////////
	//GSTR2 Summary
	  @RequestMapping("/GSTR2Summary")
	  public ModelAndView gstr2Summary(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException, ParseException {
	    logger.info("Return View");
	    List<GSTR2Summary> summaryList = new ArrayList();
	    
	    GSTR2Summary data1 = new GSTR2Summary("B2B Invoice","19","25,36,700.00" , "4,24,530.00", "29,61,230.00");
	    GSTR2Summary data2 = new GSTR2Summary("B2B Invoice - Amendment","1","1,38,500.00" , "4,24,530.00",  "1,55,120.00");
	    GSTR2Summary data3 = new GSTR2Summary("Unregistered Purchases under reverse charge","8","13,20,000.00"	 , "2,37,600.00",  "15,57,600.00");
	    GSTR2Summary data4 = new GSTR2Summary("Credit / Debit Note","3","(18,900.00)" , "(2,448.00)",  "(21,348.00)");
	    summaryList.add(data1);
	    summaryList.add(data2);
	    summaryList.add(data3);
	    summaryList.add(data4);
	    return new ModelAndView("GSTR2Summary" , "summaryList" ,  summaryList);
	  }
	  
	  
	
	
}
