package com.spring.health.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.service.annotation.PostExchange;

import com.spring.health.model.Appointment;
import com.spring.health.service.AppointmentService;

@Controller
@RequestMapping
public class AppointmentController {
	
	@Autowired
	private AppointmentService service;
	
	@GetMapping("/")
	public String Home() {
		return "showPage";
	}
	@GetMapping("/showPage")
	public String showPage() {
		return "showPage";
	}
	
	@PostMapping("/consultation")
	public String bookAppointment(Appointment app , ModelMap map) {
		map.addAttribute("consultation", service.bookAppointment(app));
		map.put("errorMsg", "Thanks For Visiting. Your Consultation Charge is Rs.");
		return "showPage";
	}
	public List<String> populateConsultation(){
		List<String> consultation = new ArrayList<>();
		consultation.add("Optometry");
		consultation.add("Psychology");
		consultation.add("Pediatrist");
		consultation.add("Physical therapy");
		consultation.add("Dentistry");
		return consultation;
	}

}
