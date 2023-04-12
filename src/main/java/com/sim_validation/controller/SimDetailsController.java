package com.sim_validation.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sim_validation.dto.AadhaarDetailsDto;
import com.sim_validation.dto.SimDetailsDto;
import com.sim_validation.entity.SimDetails;
import com.sim_validation.service.SimDetailsService;

@RestController
public class SimDetailsController {

	@Autowired
	private SimDetailsService simDetailsService;

	@PostMapping("/addsimdetails")
	public String addNumbers(@RequestBody SimDetails simDetails) {
		simDetailsService.addNumber(simDetails);
		return "sim saved in database successfully";
	}

	@PostMapping("/verify")
	@CrossOrigin
	public Object checkSim(@RequestBody SimDetailsDto simDetailsDto) {
		String isActivated = simDetailsService.check(simDetailsDto);
		Map<String, Object> object = new HashMap<>();
		if (isActivated == "Not_Activated") {
			object.put("successSim", "success");
		} else if (isActivated == "Mis_Match") {
			object.put("checkSim", "sim_number and service_number mismatching");
		} else {
			object.put("checkSim", "sim is already activated");
		}
		return object;
	}
	

}
