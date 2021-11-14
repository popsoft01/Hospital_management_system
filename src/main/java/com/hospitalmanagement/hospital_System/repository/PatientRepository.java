package com.hospitalmanagement.hospital_System.repository;

import com.hospitalmanagement.hospital_System.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
