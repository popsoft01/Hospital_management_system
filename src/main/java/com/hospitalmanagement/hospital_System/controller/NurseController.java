package com.hospitalmanagement.hospital_System.controller;

import com.hospitalmanagement.hospital_System.entity.Nurse;
import com.hospitalmanagement.hospital_System.services.nurse.NurseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/nurse")
public class NurseController {

    @Autowired
    private NurseServiceImpl nurseService;

    @GetMapping("/")
    public List<Nurse> showAllDoctor(){
        return nurseService.getAllNurse();
    }

    @PostMapping("/")
    public void addNurse(@RequestBody Nurse nurse){
        nurseService.addNurse(nurse);
    }

    @GetMapping("/{id}")
    public Optional<Nurse> getNurse(@PathVariable long id){
        return nurseService.getNurse(id);
    }

    @PutMapping("/nurse/{id}")
    public Nurse editNurse(@RequestBody Nurse nurse, @PathVariable("id") Long id){
        return nurseService.editNurse(nurse, id);
    }
    @GetMapping("/seacrh/nurse")
    public Nurse searchNurse(String name){
        return  nurseService.searchNurse(name);
    }

}
