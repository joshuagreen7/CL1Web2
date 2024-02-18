package com.cibertec.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.hospital.dto.PrescriptionCostResponse;
import com.cibertec.hospital.model.Prescription;
import com.cibertec.hospital.projections.PrescriptionCostProjection;
import com.cibertec.hospital.service.PrescriptionService;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

	@Autowired
	PrescriptionService prescriptionService;

	@GetMapping
	public ResponseEntity<List<Prescription>> list() {
		return new ResponseEntity<>(prescriptionService.list(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Prescription> add(@RequestBody Prescription pre) {
		return new ResponseEntity<>(prescriptionService.add(pre), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Prescription> update(@RequestBody Prescription pre) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(prescriptionService.update(pre), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int prescriptionId) {
		// TODO Auto-generated method stub
		prescriptionService.delete(prescriptionId); 
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	/*
	 * @GetMapping("/totalCostByPatient/{id}") public
	 * ResponseEntity<List<PrescriptionCostResponse>>
	 * getTotalPrescriptionCostByPatient() { List<PrescriptionCostResponse> response
	 * = prescriptionService.getTotalPrescriptionCostByPatient(); return new
	 * ResponseEntity<>(response, HttpStatus.OK); }
	 */
	 
	 //2
	 @GetMapping("/total-cost")
	    public ResponseEntity<List<PrescriptionCostProjection>> getTotalPrescriptionCostByPatient2() {
	        List<PrescriptionCostProjection> totalCostList = prescriptionService.getTotalPrescriptionCostByPatient2();
	        return new ResponseEntity<>(totalCostList, HttpStatus.OK);
	    }
	 
	 
}
