package com.cg.controller;

import java.util.List;

import com.cg.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.service.deliveryproservice;

@RestController
// @CrossOrigin("http://localhost:8089")
@RequestMapping("/CapStore")
public class controller {

	@Autowired
	deliveryproservice service;
	
	
	@PutMapping("/update-delivery-status/{transactionId}")
	public String updateDeliveryStatus(@PathVariable Integer transactionId) {
		
		
		
		return 	service.updateStatusAsDelivered(transactionId);
	}

}
