package com.spring.health.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.spring.health.controller.AppointmentController;
import com.spring.health.model.Appointment;

@Service
public class AppointmentService 
{	
	
	AppointmentController controller;
	
	public int bookAppointment(Appointment app) 
	{
	    Map<String, Integer> map = new HashMap<String, Integer>();
	    System.out.println(controller.populateConsultation());
	    List<String> list = controller.populateConsultation();
	    
	    map.put(list.get(0), 500);
	    map.put(list.get(1), 350);
	    map.put(list.get(2), 750);
	    map.put(list.get(3), 400);
	    map.put(list.get(4), 450);

	    return map.get(app.getConsultationFor());
	    
	    // map.get(map);
	}
	

}
