package com.example.demo.entities;


import com.example.demo.repositories.PatientRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientRecord {


    private Integer patientId;
    private String patientName;
    private String patientAdd;

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    @Id
    public Integer getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAdd() {
        return patientAdd;
    }

    public void setPatientAdd(String patientAdd) {
        this.patientAdd = patientAdd;
    }
}
