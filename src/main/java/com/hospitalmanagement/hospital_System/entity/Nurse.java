package com.hospitalmanagement.hospital_System.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Nurse {
    @Id
    private Long id;
    private String name;
    private String phoneNumber;
    private String email;
    private String password;
    private String userName;
    private String address;
    private String bloogGroup;
}
