package com.sim_validation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sim_validation.entity.CustomerAddressDetails;

public interface CustomerAddressDetailsRepository extends JpaRepository<CustomerAddressDetails, String>{

}
