package com.sim_validation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sim_validation.entity.BasicUserValidation;

public interface BasicUserValidationRepository extends JpaRepository<BasicUserValidation, String> {

}
