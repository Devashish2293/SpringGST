package com.gst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gst.Dao.ClientDAO;
import com.gst.Dao.ItemDAO;
import com.gst.Dao.PortalUserDAO;
import com.gst.models.Address;
import com.gst.models.Client;
import com.gst.models.Invoice;
import com.gst.models.Item;
import com.gst.models.PortalUser;

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

public class UserLoginController {
	protected final Log logger = LogFactory.getLog(getClass());
	  
	  @Autowired
	  private ItemDAO itemDAO;
	  @Autowired
	  private ClientDAO clientDAO;
	  @Autowired
	  private PortalUserDAO poratlUserDAO;
	
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
		  return "redirect:/SpringGST";
	  }
	  @RequestMapping("/login")
	  public ModelAndView handleLoginRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	    logger.info("Return View");
	   // String message ="Welcome to GST Site";
	    return new ModelAndView("Login", "login",new PortalUser());
	  }

	  @RequestMapping(value="/loginSubmit", method=RequestMethod.POST)
	  public String handleLoginSubmitRequest(@ModelAttribute("email") String user_email, @ModelAttribute("password") String password)
	    throws ServletException, IOException {
	    logger.info("Return View");
	   // String message ="Welcome to GST Site";
	    String redirectStr = "";
	    boolean isAuthenticated = poratlUserDAO.authenticate(user_email, password);
	    redirectStr = (isAuthenticated)? "redirect:/SpringGST": "redirect:/login";
	    return redirectStr;
	  }

}
