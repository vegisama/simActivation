package com.sim_validation.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sim_validation.dto.CompleteDetails;
import com.sim_validation.service.AddAllDetailsService;

@RestController
public class AddAllDetailsController {

	@Autowired
	private AddAllDetailsService addAllDetailsService;

	@PostMapping("/addAll")
	@CrossOrigin
	public Object addAllDetails(@RequestBody CompleteDetails completeDetails) {

		addAllDetailsService.save(completeDetails);
		Map<String, Object> object = new HashMap<>();
		object.put("success", "added successfully");
		return object;
	}
}
