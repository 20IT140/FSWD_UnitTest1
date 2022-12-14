package com.example.demo.controllers;


import com.example.demo.entities.PatientRecord;
import com.example.demo.repositories.PatientRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PatientRecordController {


    @Autowired
    PatientRecordRepository patientRecordRepository;


    @GetMapping("/patient")
    public List<PatientRecord> getListOfPatients()
    {
        return patientRecordRepository.findAll();

    }

    @GetMapping("/patient/{patientId}")
    public PatientRecord getPatient(@PathVariable Integer patientId){

        return patientRecordRepository.findById(patientId).get();
    }

    @PostMapping("/patient")
    public List<PatientRecord> addPatient(@RequestBody PatientRecord patientRecord) {
        patientRecordRepository.save(patientRecord);
        return patientRecordRepository.findAll();
    }

    @PutMapping("/patient/{patientId}")
    public List<PatientRecord> updatePatient(@RequestBody PatientRecord patientRecord , @PathVariable Integer patientId){


        PatientRecord patientObj =patientRecordRepository.findById(patientId).get();
        patientObj.setPatientName(patientRecord.getPatientName());
        patientObj.setPatientAdd(patientRecord.getPatientAdd());
        patientRecordRepository.save(patientObj);
        return patientRecordRepository.findAll();
    }

    @DeleteMapping("/patient/{patientId}")
    public List<PatientRecord> deletePatient(@PathVariable Integer patientId){

        patientRecordRepository.delete(patientRecordRepository.findById(patientId).get());
        return patientRecordRepository.findAll();
    }
}
