package com.hospitalmanagement.hospital_System.services.Medicine;

import com.hospitalmanagement.hospital_System.entity.Doctor;
import com.hospitalmanagement.hospital_System.entity.Medicine;
import com.hospitalmanagement.hospital_System.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MedicineServiceImpl implements MedicineService{

    @Override
    public List<Medicine> getAllMedicine() {
        return null;
    }

    @Override
    public Optional<Patient> getMedicine(Long id) {
        return Optional.empty();
    }

    @Override
    public void addMedicine(Medicine medicine) {

    }

    @Override
    public void deleteMedicine(Medicine medicine) {

    }

    @Override
    public Doctor editMedicine(Medicine medicine) {
        return null;
    }

    @Override
    public Doctor searchMedicine(String name) {
        return null;
    }
}
