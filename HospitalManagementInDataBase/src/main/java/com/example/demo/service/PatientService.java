package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Patientrepo;
import com.example.demo.entity.Patient;

@Service
public class PatientService {
	@Autowired
	Patientrepo pr;

	public void save(Patient p) {
		pr.save(p);

	}

	public void delete(int pid) {
		pr.deleteById(pid);

	}

	public Patient getPatient(int pid) {
		Optional<Patient> o = pr.findById(pid);
		Patient P = o.get();

		return P;
	}

}
