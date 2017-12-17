package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.dao.ICustomerDao;
import com.app.models.Customer;
import com.app.service.ICustomerService;

@Controller
public class customerController {
	
	@Autowired
	private ICustomerService customerService;
	
	@RequestMapping(value="registerUser", method=RequestMethod.GET)
	public String register() {
		return "registerUser";
	}
	@RequestMapping(value="create", method=RequestMethod.POST)
	public ModelAndView create(@ModelAttribute("customer") Customer customer) {
		customer.setStatus(false);
		System.out.println(customer);
		customerService.createCustomer(customer);
		
		return new ModelAndView("login", "msg", "welcome \n you need to login now");
	}
}
