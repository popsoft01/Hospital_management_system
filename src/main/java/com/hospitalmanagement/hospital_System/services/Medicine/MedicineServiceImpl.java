package com.hospitalmanagement.hospital_System.services.Medicine;

import com.hospitalmanagement.hospital_System.entity.Medicine;
import com.hospitalmanagement.hospital_System.repository.MedicineRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MedicineServiceImpl implements MedicineService{
    @Autowired
    private MedicineRespository medicineRespository;

    @Override
    public List<Medicine> getAllMedicine() {
        return medicineRespository.findAll();
    }

    @Override
    public Optional<Medicine> getMedicine(Long id) {
        return medicineRespository.findById(id);
    }

    @Override
    public void addMedicine(Medicine medicine) {
        medicineRespository.save(medicine);
    }

    @Override
    public void deleteMedicine(Medicine medicine) {
    medicineRespository.delete(medicine);
    }

    @Override
    public Medicine editMedicine(Medicine medicine, Long id) {
        return medicineRespository.save(medicine);
    }

    @Override
    public Medicine searchMedicine(String name) {
        return null;
    }
}
