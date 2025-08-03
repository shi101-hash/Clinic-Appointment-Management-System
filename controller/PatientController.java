package com.example.Clinic.controller;

import com.example.Clinic.entity.Patient;
import com.example.Clinic.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService = new PatientService();

    @PostMapping
    public Patient registerPatient(@RequestBody Patient patient) {
        return patientService.registerPatient(patient);
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }
}
