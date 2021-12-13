package com.hospitalmanagement.hospital_System.repository;

import com.hospitalmanagement.hospital_System.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

}
