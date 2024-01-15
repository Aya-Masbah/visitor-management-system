package com.example.vms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.vms.models.Visitor;
import com.example.vms.services.VisitorService;

@Controller
public class VisitorController {
	@Autowired 
	private VisitorService visitorService;
	
	@GetMapping("/visitors")
	public String getVisitors(Model model) {
		
		List<Visitor> visitorList = visitorService.findAll();

		
		model.addAttribute("visitors",visitorList);
		
		return "visitor";
	}

}
