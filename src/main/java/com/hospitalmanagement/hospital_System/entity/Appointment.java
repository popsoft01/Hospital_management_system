package com.hospitalmanagement.hospital_System.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table
public class Appointment {
    @Id
    private Long appointmentId;
    private String name;
    private String phoneNumber;
    private String email;
    private LocalDateTime appointmentTime;
}
