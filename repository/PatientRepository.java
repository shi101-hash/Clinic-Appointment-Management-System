package com.example.Clinic.respository;

import com.example.Clinic.entity.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PatientRepository {

    private final Map<Long, Patient> patientMap = new ConcurrentHashMap<>();

    public Patient save(Patient patient) {
        patientMap.put(patient.getId(), patient);
        return patient;
    }

    public List<Patient> findAll() {
        return new ArrayList<>(patientMap.values());
    }

    public Patient findById(Long id) {
        return patientMap.get(id);
    }

}
