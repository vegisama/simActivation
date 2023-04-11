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
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cus_add_det")
public class CustomerAddressDetails {
	
	@Id
	@Size(min=10,max=10)
	private String serviceNumber;
	
	@Size(max=25)
	@Column(nullable=false)
	private String address;
	
	@Column(nullable=false)
	private String state;
	
	@Column(nullable = false)
	@Size(min=6,max=6)
	private String pincode;
	
	@Column(nullable = false)
	private String city;
}
