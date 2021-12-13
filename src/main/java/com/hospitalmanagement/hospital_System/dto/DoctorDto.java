package com.hospitalmanagement.hospital_System.dto;

import lombok.Data;

@Data
public class DoctorDto {
    private Long id;
    private String name;
    private String phoneNumber;
    private String email;
    private String password;
    private String userName;
    private String doctorSpeciality;
    private String address;
    private String bloogGroup;
}
