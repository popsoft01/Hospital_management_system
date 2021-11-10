package com.hospitalmanagement.hospital_System.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    private String hospitalAddress;
    private String hospitalType;
    
}
