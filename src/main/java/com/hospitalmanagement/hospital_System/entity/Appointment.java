package com.hospitalmanagement.hospital_System.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long appointmentId;
    private String name;
    private String phoneNumber;
    private String email;
    private LocalDateTime appointmentTime;


    private Doctor doctor;
}
