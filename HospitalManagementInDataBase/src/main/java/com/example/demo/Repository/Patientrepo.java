package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Patient;

public interface Patientrepo extends JpaRepository<Patient, Integer>{

}
