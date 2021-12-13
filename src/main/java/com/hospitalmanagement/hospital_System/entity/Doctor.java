package com.hospitalmanagement.hospital_System.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String doctorSpeciality;
    private String address;
    private String bloogGroup;

    @OneToMany
    List<Patient> patientList = new ArrayList<>();
}
