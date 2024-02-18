package com.cibertec.hospital.dto;

import lombok.Data;

@Data
public class PrescriptionCostResponse {
	private int patientId;
    private String patientFName;
    private String patientLName;
    private Double totalPrescriptionCost;
	
	
}
