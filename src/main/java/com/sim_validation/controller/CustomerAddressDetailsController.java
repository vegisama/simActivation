package com.sim_validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sim_validation.entity.CustomerAddressDetails;
import com.sim_validation.service.CustomerAddressDetailsService;

@RestController
public class CustomerAddressDetailsController {
	
	@Autowired
	private CustomerAddressDetailsService customerAddressDetailsService;
	
	@PostMapping("/{serviceNumber}/addressdetails")
	public String addAddressDetails(@PathVariable String serviceNumber,@RequestBody CustomerAddressDetails CustomerAddressDetails) {
		customerAddressDetailsService.saveAddress(serviceNumber,CustomerAddressDetails);
		return "address saved";
		
	}
}
