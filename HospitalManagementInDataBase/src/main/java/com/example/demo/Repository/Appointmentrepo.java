package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Appointment;

public interface Appointmentrepo extends JpaRepository<Appointment, Integer>{

}
