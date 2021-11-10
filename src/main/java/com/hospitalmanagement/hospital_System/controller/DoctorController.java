package com.hospitalmanagement.hospital_System.controller;

import com.hospitalmanagement.hospital_System.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;

public class DoctorController {

    private DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }
}
