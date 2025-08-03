package com.example.Clinic.service;



import com.example.Clinic.entity.Patient;
import com.example.Clinic.exception.ApiException;
import com.example.Clinic.respository.PatientRepository;

import java.util.List;

public class PatientService {
    private final PatientRepository patientRepository = new PatientRepository();

    public Patient registerPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        Patient patient = patientRepository.findById(id);
        if (patient == null) {
            throw new ApiException("Patient not found with ID: " + id);
        }
        return patient;
    }
}
