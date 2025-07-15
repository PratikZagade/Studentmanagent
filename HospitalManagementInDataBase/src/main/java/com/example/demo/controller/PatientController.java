package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RestController
public class PatientController {
	@Autowired
	PatientService ps;
	
	@PostMapping("addPatient")
	public String addPatient(@RequestBody Patient p) {
		ps.save(p);
		return"Add Patient Info.....";
	}
	@DeleteMapping("deletepatient/{pid}")
	public String deletepatient(@PathVariable int pid) {
		ps.delete(pid);
		return "Delete Patient Info....";
	}
	@GetMapping("GetPatient/{pid}")
	public Patient GetPatient(@PathVariable int pid) {
		return ps.getPatient(pid);
	}

}
