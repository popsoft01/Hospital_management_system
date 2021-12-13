package com.hospitalmanagement.hospital_System.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    @Column(name = "blood_group")
    private String bloodGroup;
}
