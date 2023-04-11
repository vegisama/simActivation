package com.sim_validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sim_validation.entity.CustomerPersonalDetails;
import com.sim_validation.service.CustomerPersonalDetailsService;

@RestController
public class CustomerPersonalDetailsController {
	
	@Autowired
	private CustomerPersonalDetailsService customerPersonalDetailsService;
	
	@PostMapping("/{serviceNumber}/customerpersonaldetails")
	public String addCustomerPersonalDetails(@PathVariable String serviceNumber,@RequestBody  CustomerPersonalDetails customerPersonalDetails) {
		customerPersonalDetailsService.saveDetails(serviceNumber,customerPersonalDetails);
		return "customer details saved";
	}
	

}
