package com.sim_validation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sim_validation.entity.SimDetails;

public interface SimDetailsRepository extends JpaRepository<SimDetails, String>{

}
