package com.sim_validation.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim_validation.dto.CompleteDetails;
import com.sim_validation.entity.ActivatedSimCards;
import com.sim_validation.repo.ActivatedSimCardsRepository;
import com.sim_validation.service.ActivateSimCardsService;

@Service
public class ActivatedSimCardsServiceImple implements ActivateSimCardsService {

	@Autowired
	private ActivatedSimCardsRepository activatedSimCardsRepository;

	@Override
	public String saveActivatedSim(ActivatedSimCards activatedSimCards) {
		activatedSimCardsRepository.save(activatedSimCards);
		return "sim added";
	}

	@Override
	public List<ActivatedSimCards> getAll() {
		return activatedSimCardsRepository.findAll();
	}

}
