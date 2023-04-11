package com.sim_validation.service;

import java.util.List;

import com.sim_validation.dto.CompleteDetails;
import com.sim_validation.entity.ActivatedSimCards;

public interface ActivateSimCardsService {

	String saveActivatedSim(ActivatedSimCards activatedSimCards);

	List<ActivatedSimCards> getAll();

}
