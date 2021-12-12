package com.hospitalmanagement.hospital_System.services.nurse;

import com.hospitalmanagement.hospital_System.entity.Doctor;
import com.hospitalmanagement.hospital_System.entity.Nurse;

import java.util.List;
import java.util.Optional;

public interface NurseService {
    List<Nurse> getAllNurse();
    Optional<Nurse> getNurse(Long id);
    void addNurse(Nurse nurse);
    void deleteNurse(Nurse nurse);
    Nurse editNurse(Nurse nurse, Long id);
    Nurse searchNurse(String name);
}
