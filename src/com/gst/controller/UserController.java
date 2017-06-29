package com.gst.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gst.DaoImpl.UserDaoImpl;
import com.gst.models.UserBean;

@Controller
public class UserController {

	@Autowired

	private UserDaoImpl userDaoImpl;

	@RequestMapping(value = "/users")
	public ModelAndView listUser(ModelAndView model) throws IOException {

		List<UserBean> listUser = userDaoImpl.list();
		model.addObject("listUser", listUser);
		model.setViewName("home");

		return model;
	}

	@RequestMapping(value = "/newUser", method = RequestMethod.GET)
	public ModelAndView newUser(ModelAndView model) {

		
		UserBean newUser = new UserBean();
		model.addObject("newUser", newUser);
		model.setViewName("newUser");

		return model;
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute UserBean user) {

		userDaoImpl.saveOrUpdate(user);
		return new ModelAndView("redirect:/users");
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request) {
		int portal_user_id = Integer.parseInt(request.getParameter("id"));
		userDaoImpl.delete(portal_user_id);
		return new ModelAndView("redirect:/users");
	}

	@RequestMapping(value = "/editUser", method = RequestMethod.GET)
	public ModelAndView editUser(HttpServletRequest request) {
		int portal_user_id = Integer.parseInt(request.getParameter("id"));
		UserBean newUser = userDaoImpl.get(portal_user_id);
		ModelAndView model = new ModelAndView("newUser");
		model.addObject("newUser", newUser);

		return model;
	}
}
