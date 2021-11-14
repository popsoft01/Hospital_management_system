package com.hospitalmanagement.hospital_System.services.patient;

import com.hospitalmanagement.hospital_System.entity.Doctor;
import com.hospitalmanagement.hospital_System.entity.Patient;

import java.util.List;
import java.util.Optional;

public class PetientServiceImpl implements PatientService{
    @Override
    public List<Patient> getAllPatient() {
        return null;
    }

    @Override
    public Optional<Patient> getPatient(Long id) {
        return Optional.empty();
    }

    @Override
    public void addPatient(Patient patient) {

    }

    @Override
    public void deletePatient(Patient patient) {

    }

    @Override
    public Doctor editPatient(Patient patient) {
        return null;
    }

    @Override
    public Doctor searchPatient(String name) {
        return null;
    }
}
