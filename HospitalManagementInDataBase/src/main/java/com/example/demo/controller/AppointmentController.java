package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Appointment;
import com.example.demo.service.AppointmentService;

@RestController
public class AppointmentController {
	@Autowired
	AppointmentService as;

	@PostMapping("addAppointment")
	public String addAppointment(@RequestBody Appointment a) {

		as.save(a);
		return "add Appointment.......";
	}
	@DeleteMapping("Appointment/{aid}")
	public String deleteAppointment(@PathVariable int aid) {
		as.delete(aid);
		return"Appointment Deleted....."; 
	}
	@GetMapping("GetAppointment/{aid}")
	public Appointment GetAppointment(@PathVariable int aid) {
		return as.getAppointment(aid);
	}

}
