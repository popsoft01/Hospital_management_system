package com.hospitalmanagement.hospital_System.controller;

import com.hospitalmanagement.hospital_System.entity.Doctor;
import com.hospitalmanagement.hospital_System.services.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctor")
    public List<Doctor> showAllDoctor(){
        return doctorService.getAllDoctor();
    }

    @PostMapping
    public void addDoctor(@RequestBody Doctor doctor){
        doctorService.addDoctor(doctor);
    }
    @GetMapping("/{id}")
    public Doctor getDoctor(@PathVariable long id){
        return doctorService.getDoctor(id).get();
    }

}
