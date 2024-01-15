package com.example.vms.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vms.models.Visitor;
import com.example.vms.repositories.VisitorRepository;

@Service
public class VisitorService {
	
	@Autowired
	private VisitorRepository visitorRepository;
	
	//Get All Visitors
		public List<Visitor> findAll(){
			return visitorRepository.findAll();
		}

}





