package com.hospitalmanagement.hospital_System.services.patient;

import com.hospitalmanagement.hospital_System.entity.Doctor;
import com.hospitalmanagement.hospital_System.entity.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    List<Patient> getAllPatient();
    Optional<Patient> getPatient(Long id);
    void addPatient(Patient patient);
    void deletePatient(Patient patient);
    Doctor editPatient(Patient patient);
    Doctor searchPatient(String name);
}
