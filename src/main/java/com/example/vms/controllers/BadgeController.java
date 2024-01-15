package com.example.vms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BadgeController {
	@GetMapping("/badges")
	public String getBadges() {
		return "badge";
	}

}
