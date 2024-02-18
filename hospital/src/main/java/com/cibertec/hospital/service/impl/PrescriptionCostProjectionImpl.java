package com.cibertec.hospital.service.impl;

import com.cibertec.hospital.projections.PrescriptionCostProjection;

public class PrescriptionCostProjectionImpl implements PrescriptionCostProjection {
	
	 private int patientId;
	 private String patientFName;
	 private String patientLName;
	 private Double totalPrescriptionCost;

	 @Override
	    public int getPatientId() {
	        return patientId;
	    }

	    @Override
	    public void setPatientId(int patientId) {
	        this.patientId = patientId;
	    }

	    @Override
	    public String getPatientFName() {
	        return patientFName;
	    }

	    @Override
	    public void setPatientFName(String patientFName) {
	        this.patientFName = patientFName;
	    }

	    @Override
	    public String getPatientLName() {
	        return patientLName;
	    }

	    @Override
	    public void setPatientLName(String patientLName) {
	        this.patientLName = patientLName;
	    }

	    @Override
	    public Double getTotalPrescriptionCost() {
	        return totalPrescriptionCost;
	    }

	    @Override
	    public void setTotalPrescriptionCost(Double totalPrescriptionCost) {
	        this.totalPrescriptionCost = totalPrescriptionCost;
	    }

}
