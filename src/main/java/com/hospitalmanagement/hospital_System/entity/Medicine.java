package com.hospitalmanagement.hospital_System.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Medicine {
    @Id
    private Long id;
    private String name;
    private String address;
    private String bloogGroup;
}
