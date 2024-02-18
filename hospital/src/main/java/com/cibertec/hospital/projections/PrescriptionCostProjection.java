package com.cibertec.hospital.projections;

import org.springframework.beans.factory.annotation.Value;


public interface PrescriptionCostProjection {
	 int getPatientId();
	    String getPatientFName();
	    String getPatientLName();
	    
	    @Value("#{target.patient.prescriptions.stream().mapToDouble(p -> {return p.getPrescriptionCost();}).sum()}")
	    Double getTotalPrescriptionCost();
		void setPatientId(int patientId);
		void setPatientFName(String patientFName);
		void setPatientLName(String patientLName);
		void setTotalPrescriptionCost(Double totalPrescriptionCost);
}
