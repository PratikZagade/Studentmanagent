package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	DoctorService ds;
	
	@PostMapping("addDoctor")
	public String addDoctor(@RequestBody Doctor d) {
		ds.save(d);
		return"Doctor info added......";
	}
	@DeleteMapping("DeleteDoctor/{did}")
	public String deletedoctor(@PathVariable int did) {
		ds.delete(did);
		return "Doctor info deleted....";
	}
	@GetMapping("GetDoctor/{did}")
	public Doctor GetDoctor(@PathVariable int did) {
		return ds.GetDoctor(did);
	}

}
