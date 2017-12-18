package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.models.Doctor;
import com.app.service.DoctorService;

@Controller
public class doctorController {

	@Autowired
	private DoctorService doctorService;
	
	@RequestMapping(value="addDoctor", method=RequestMethod.GET)
	public String addDoctor() {
		return "addDoctor";
	}
	
	@RequestMapping(value="saveDoctor", method=RequestMethod.POST)
	public String saveDoctor (@ModelAttribute("doctor") Doctor doctor) {
		doctorService.save(doctor);
		
		return "addDoctor";
	}
}
