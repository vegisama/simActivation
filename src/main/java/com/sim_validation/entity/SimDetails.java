package com.sim_validation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name="Sim_Details")
public class SimDetails {
	
	@Id
	@Size(min=10,max=10)
	private String serviceNumber;
	
	@Column(name = "sim_num",nullable=false,unique=true)
	@Size(min=13,max=13)
	private String simNumber;

}
