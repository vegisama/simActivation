package com.sim_validation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "act_cards")
@Entity
public class ActivatedSimCards {

	@Id
	@Size(min = 10, max = 10)
	@Column(nullable = false,unique = true)
	private String serviceNumber;

}
