package com.cibertec.hospital.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.hospital.dto.PrescriptionCostResponse;
import com.cibertec.hospital.model.Patient;
import com.cibertec.hospital.model.Prescription;
import com.cibertec.hospital.projections.PrescriptionCostProjection;
import com.cibertec.hospital.repo.PatientRepo;
import com.cibertec.hospital.repo.PrescriptionRepo;
import com.cibertec.hospital.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService{
	
	private final PatientRepo patientRepo;
	
    @Autowired
    public PrescriptionServiceImpl(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }
	
	/*
	 * @Override public List<PrescriptionCostResponse>
	 * getTotalPrescriptionCostByPatient() { List<PrescriptionCostResponse>
	 * responseList = new ArrayList<>();
	 * 
	 * List<Patient> patients = patientRepo.findAll(); // lista de pacientes desde
	 * repo
	 * 
	 * for (Patient patient : patients) { List<Prescription> prescriptions =
	 * prescriptionRepo.findAllByPatientId(patient.getId()); // prescripciones para
	 * este paciente
	 * 
	 * Double totalCost = 0.0; for (Prescription prescription : prescriptions) {
	 * totalCost += prescription.getPrescriptionCost(); // Suma el costo de cada
	 * prescripción }
	 * 
	 * PrescriptionCostResponse response = new PrescriptionCostResponse();
	 * response.setPatientId(patient.getId());
	 * response.setPatientFName(patient.getPatientFName());
	 * response.setPatientLName(patient.getPatientLName());
	 * response.setTotalPrescriptionCost(totalCost); responseList.add(response); }
	 * return responseList; }
	 */
    
    //2
    
    
    @Override
    public List<PrescriptionCostProjection> getTotalPrescriptionCostByPatient2() {
        List<PrescriptionCostProjection> responseList = new ArrayList<>();
        
        List<Patient> patients = patientRepo.findAll(); // lista de pacientes desde repo

        for (Patient patient : patients) {
            List<Prescription> prescriptions = prescriptionRepo.findAllByPatientId(patient.getId()); // prescripciones para este paciente
            
            Double totalCost = 0.0;
            for (Prescription prescription : prescriptions) {
                totalCost += prescription.getPrescriptionCost(); // Suma el costo de cada prescription
            }
            
            PrescriptionCostProjectionImpl projection = new PrescriptionCostProjectionImpl();
            projection.setPatientId(patient.getId());
            projection.setPatientFName(patient.getPatientFName());
            projection.setPatientLName(patient.getPatientLName());
            projection.setTotalPrescriptionCost(totalCost);
            responseList.add(projection);
        }
        return responseList;
    }
	
	@Autowired
	PrescriptionRepo prescriptionRepo;

	@Override
	public List<Prescription> list() {
		// TODO Auto-generated method stub
		return prescriptionRepo.findAll();
	}

	@Override
	public Prescription add(Prescription pre) {
		// TODO Auto-generated method stub
		return prescriptionRepo.save(pre);
	}

	@Override
	public Prescription update(Prescription pre) {
		// TODO Auto-generated method stub
		return prescriptionRepo.save(pre);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		prescriptionRepo.deleteById(id);
	}

	
	

}
