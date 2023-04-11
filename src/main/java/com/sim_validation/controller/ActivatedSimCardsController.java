package com.sim_validation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sim_validation.dto.CompleteDetails;
import com.sim_validation.entity.ActivatedSimCards;
import com.sim_validation.service.ActivateSimCardsService;

@RestController
public class ActivatedSimCardsController {
	
	@Autowired
	private ActivateSimCardsService activateSimCardsService;
	
	@PostMapping("/activatedSim")
	public String addActivatedSim(@RequestBody ActivatedSimCards activatedSimCards) {
		activateSimCardsService.saveActivatedSim(activatedSimCards);
		return "sim added";
	}
	
	
	@GetMapping("/activatedSim/all")
	public List<ActivatedSimCards> getAll() {
		return activateSimCardsService.getAll();
	}
}
