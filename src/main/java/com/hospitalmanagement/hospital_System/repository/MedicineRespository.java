package com.hospitalmanagement.hospital_System.repository;

import com.hospitalmanagement.hospital_System.entity.Medicine;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRespository extends JpaRepository<Medicine, Long> {
    Medicine findMedicineByName(String id);
}
