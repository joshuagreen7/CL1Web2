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
@Table (name = "invoice")
public class Invoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int invoiceId;
	// FK
	@ManyToOne
	@JoinColumn (name="patientId")
	private Patient patient;
	private String serviceDescription;
	private Double Cost;
	private Double total;
	
}
