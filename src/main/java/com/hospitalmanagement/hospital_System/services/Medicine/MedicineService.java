package com.hospitalmanagement.hospital_System.services.Medicine;

import com.hospitalmanagement.hospital_System.entity.Doctor;
import com.hospitalmanagement.hospital_System.entity.Medicine;
import com.hospitalmanagement.hospital_System.entity.Patient;

import java.util.List;
import java.util.Optional;

public interface MedicineService {
    List<Medicine> getAllMedicine();
    Optional<Patient> getMedicine(Long id);
    void addMedicine(Medicine medicine);
    void deleteMedicine(Medicine medicine);
    Doctor editMedicine(Medicine medicine);
    Doctor searchMedicine(String name);
}
