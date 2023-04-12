package com.sim_validation.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sim_validation.dto.AadhaarDetailsDto;
import com.sim_validation.entity.AadhaarDetails;
import com.sim_validation.service.AadhaarDetailsService;

@RestController
public class AadhaarDetailsController {
	
	@Autowired
	private AadhaarDetailsService aadhaarDetailsService;
	
	@PostMapping("/addIdDetails")
	public String addDetails(@RequestBody AadhaarDetails aadhaarDetails) {
		aadhaarDetailsService.addDetails(aadhaarDetails);
		return "details added";
	}
	
	@PostMapping("/checkId")
	@CrossOrigin
	public Object confirmAadhaar(@RequestBody AadhaarDetailsDto aadhaarDetailsDto  ) {
		String aadhaarPresent=aadhaarDetailsService.checkAadhar(aadhaarDetailsDto);
		Map<String, Object> object = new HashMap<>();
		if (aadhaarPresent == "valid_aadhaar") {
			object.put("successSim", "success");
		} else {
			object.put("checkAadhaar", "Invalid Aadhaar");
		}
		return object;
		
	}

}
