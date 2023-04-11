package com.sim_validation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sim_validation.entity.CustomerPersonalDetails;

public interface CustomerPersonalDetailsRepository extends JpaRepository<CustomerPersonalDetails, String>{

}
