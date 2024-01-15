package com.example.vms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {
	
	@GetMapping("/events")
	public String getEvents() {
		return "event";
	}

}
