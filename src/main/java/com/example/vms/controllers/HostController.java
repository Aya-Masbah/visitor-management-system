package com.example.vms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HostController {
	@GetMapping("/hosts")
	public String gethosts() {
		return "host";
	}

}
