package com.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.DoctorType;
import com.service.DoctorTypeService;
import com.service.LocationService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private DoctorTypeService docTypeService;
	
//	@Autowired
//	private LocationService locationService;
	
	@GetMapping("/docTypeList")
	public String listDocType(Model model) {
		
		List<DoctorType> theDocTypes = docTypeService.getAll();
		
		model.addAttribute("docTypes", theDocTypes);
		return "list-docTypes";
		
	}
	
//	/*@GetMapping("/addDocTypeForm")
//	public String addDocTypeForm(Model theModel) {
//		
//		// create model attribute to bind form data
//		DoctorType theDocType = new DoctorType();
//		
//		theModel.addAttribute("docType", theDocType);
//		
//		return "redirect:/admin/saveDocType";
//	}*/
	
	@RequestMapping("/saveDocType")
	public String saveDocType(@ModelAttribute("docType") DoctorType theDocType) {
		
		// save the customer using our service
		docTypeService.save(theDocType);	
		
		return "redirect:/admin/docTypeList";
	}
}
