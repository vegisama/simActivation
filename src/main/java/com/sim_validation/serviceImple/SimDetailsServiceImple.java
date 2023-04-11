package com.sim_validation.serviceImple;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim_validation.dto.SimDetailsDto;
import com.sim_validation.entity.ActivatedSimCards;
import com.sim_validation.entity.SimDetails;
import com.sim_validation.repo.ActivatedSimCardsRepository;
import com.sim_validation.repo.SimDetailsRepository;
import com.sim_validation.service.SimDetailsService;

@Service
public class SimDetailsServiceImple implements SimDetailsService {

	@Autowired
	private SimDetailsRepository simDetailsRepository;

	@Autowired
	private ActivatedSimCardsRepository activatedSimCardsRepository;

	@Override
	public String addNumber(SimDetails simDetails) {
		simDetailsRepository.save(simDetails);
		return "sim saved in sim database";

	}

	@Override
	public String check(SimDetailsDto simDetailsDto) {
		Optional<ActivatedSimCards> activatedSim = activatedSimCardsRepository
				.findById(simDetailsDto.getServiceNumber());
		Optional<SimDetails> freshSim = simDetailsRepository.findById(simDetailsDto.getServiceNumber());
		if (activatedSim.isPresent()) {
			return "Activated";
		} else if (freshSim.isPresent() && freshSim.get().getSimNumber().equals(simDetailsDto.getSimNumber())) {
			return "Not_Activated";
		} else {
			return "Mis_Match";
		}

	}

}
