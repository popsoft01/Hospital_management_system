package com.hospitalmanagement.hospital_System.repository;

import com.hospitalmanagement.hospital_System.entity.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NurseRepository extends JpaRepository<Nurse, Long> {
    Nurse findNurseByName(String name);
}
