package com.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.entity.Doctor;
import com.entity.DoctorType;
import com.entity.Location;
import com.service.DoctorService;
import com.service.DoctorTypeService;
import com.service.LocationService;

@Controller
@RequestMapping("/admin")
@SessionAttributes("admin")
public class AdminController {

	@Autowired
	private DoctorTypeService doctorTypeService;

	@Autowired
	private LocationService locationService;

	@Autowired
	private DoctorService doctorService;
	
	
//	@ModelAttribute("admin")
//	public SpecificationGpu getForm(){
//		return new SpecificationGpu();
//	}
	
	@GetMapping
	public String show(Model model) {
		
		List<Doctor> theDoctors = doctorService.getAll();

		model.addAttribute("doctors", theDoctors);

//		model.addAttribute("doctors", doctorService.getAll());
		
		return "saveLocation";
	}
	

	@GetMapping("/listDoctorTypes")
	public String listDocType(Model model) {

		List<DoctorType> theDoctorTypes = doctorTypeService.getAll();

		model.addAttribute("doctorTypes", theDoctorTypes);
		return "list-doctorTypes";
	}

	@GetMapping("/showDoctorTypeForm")
	public String addDocTypeForm(Model theModel) {

		// create model attribute to bind form data
		DoctorType theDocType = new DoctorType();

		theModel.addAttribute("doctorType", theDocType);

		return "doctorType-form";
	}

	@RequestMapping("/saveDoctorType")
	public String saveDocType(@ModelAttribute("doctorType") DoctorType theDoctorType) {

		// save the customer using our service
		doctorTypeService.save(theDoctorType);

		return "redirect:/admin/listDoctorTypes";
	}

	@GetMapping("/listLocations")
	public String listlocations(Model model) {

		List<Location> theLocations = locationService.getAll();

		model.addAttribute("locations", theLocations);
		return "list-locations";
	}

	@GetMapping("/showLocationForm")
	public String addLocationForm(Model theModel) {

		// create model attribute to bind form data
		Location theLocation = new Location();

		theModel.addAttribute("location", theLocation);

		return "location-form";// list of doctors, add as a mode to this location-from.jsp
	}

	/*@RequestMapping
	public String printDoctors(Model theModel) {

		List<Doctor> theDoctors = doctorService.getAll();

		theModel.addAttribute("doctors", theDoctors);
		
		return "location-form";
	}
*/
	@RequestMapping("/saveLocation")
	public String saveLocation(@ModelAttribute("location") Location theLocation) {
		// Doctor doctor = new Doctor();
		// doctor.getId();
		// doctor.setId(1);
		//
		
		

		// theLocation.setDoctor(doctor);
		// save the customer using our service
		locationService.save(theLocation);

		return "redirect:/admin/listLocations";
	}
}
