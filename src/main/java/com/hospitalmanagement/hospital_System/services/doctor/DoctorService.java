package com.hospitalmanagement.hospital_System.services.doctor;

import com.hospitalmanagement.hospital_System.entity.Doctor;

import java.util.List;
import java.util.Optional;


public interface DoctorService {
    List<Doctor> getAllDoctor();
    Optional<Doctor> getDoctor(Long id);
    void addDoctor(Doctor doctor);
    void deleteDoctor(Doctor doctor);
    Doctor editDoctor(Doctor doctor);
    Doctor searchDoctor(String name);





//    public void deleteDoctor(Doctor doctor){
//        doctorRepository.delete(doctor);
//    }


}
