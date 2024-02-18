package com.cibertec.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;
	private String departmentName;
	// FK private int hospitalId;
	@ManyToOne
	@JoinColumn (name="hospitalId")
	private Hospital hospital;
}
