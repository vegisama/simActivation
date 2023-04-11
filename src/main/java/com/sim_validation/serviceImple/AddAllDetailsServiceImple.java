package com.sim_validation.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim_validation.dto.CompleteDetails;
import com.sim_validation.entity.ActivatedSimCards;
import com.sim_validation.entity.BasicUserValidation;
import com.sim_validation.entity.CustomerAddressDetails;
import com.sim_validation.entity.CustomerPersonalDetails;
import com.sim_validation.repo.ActivatedSimCardsRepository;
import com.sim_validation.repo.BasicUserValidationRepository;
import com.sim_validation.repo.CustomerAddressDetailsRepository;
import com.sim_validation.repo.CustomerPersonalDetailsRepository;
import com.sim_validation.service.AddAllDetailsService;

@Service
public class AddAllDetailsServiceImple implements AddAllDetailsService {

	@Autowired
	private CustomerPersonalDetailsRepository customerPersonalDetailsRepository;

	@Autowired
	private ActivatedSimCardsRepository activatedSimCardsRepository;

	@Autowired
	private BasicUserValidationRepository basicUserValidationRepository;

	@Autowired
	private CustomerAddressDetailsRepository customerAddressDetailsRepository;

	@Override
	public void save(CompleteDetails completeDetails) {
		CustomerPersonalDetails cusPerDet = new CustomerPersonalDetails();
		cusPerDet.setServiceNumber(completeDetails.getServiceNumber());
		cusPerDet.setFirstName(completeDetails.getFirstName());
		cusPerDet.setLastName(completeDetails.getLastName());
		cusPerDet.setTitle(completeDetails.getTitle());
		cusPerDet.setDateOfBirth(completeDetails.getDateOfBirth());
		cusPerDet.setEmail(completeDetails.getEmail());
		customerPersonalDetailsRepository.save(cusPerDet);

		ActivatedSimCards actSimCards = new ActivatedSimCards();

		actSimCards.setServiceNumber(completeDetails.getServiceNumber());

		activatedSimCardsRepository.save(actSimCards);

		BasicUserValidation basicUserValidation = new BasicUserValidation();

		basicUserValidation.setEmail(completeDetails.getEmail());
		basicUserValidationRepository.save(basicUserValidation);
		CustomerAddressDetails customerAddressDetails = new CustomerAddressDetails();

		customerAddressDetails.setServiceNumber(completeDetails.getServiceNumber());
		customerAddressDetails.setCity(completeDetails.getCity());
		customerAddressDetails.setAddress(completeDetails.getAddress());
		customerAddressDetails.setPincode(completeDetails.getPincode());
		customerAddressDetails.setState(completeDetails.getState());
		customerAddressDetailsRepository.save(customerAddressDetails);
	}

}
