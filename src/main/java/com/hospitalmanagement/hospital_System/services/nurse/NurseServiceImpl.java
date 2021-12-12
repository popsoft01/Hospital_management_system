package com.hospitalmanagement.hospital_System.services.nurse;

import com.hospitalmanagement.hospital_System.entity.Nurse;
import com.hospitalmanagement.hospital_System.repository.NurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class NurseServiceImpl implements NurseService{

    @Autowired
    NurseRepository nurseRepository;

    @Override
    public List<Nurse> getAllNurse() {
        return nurseRepository.findAll();
    }

    @Override
    public Optional<Nurse> getNurse(Long id) {
        return nurseRepository.findById(id);
    }

    @Override
    public void addNurse(Nurse nurse) {
        nurseRepository.save(nurse);
    }

    @Override
    public void deleteNurse(Nurse nurse) {
        nurseRepository.delete(nurse);
    }

    @Override
    public Nurse editNurse(Nurse nurse, Long id) {
        return nurseRepository.save(nurse);
    }

    @Override
    public Nurse searchNurse(String name) {
        return nurseRepository.findNurseByName(name);
    }
}
