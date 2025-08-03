package com.example.Clinic.service;


import com.example.Clinic.entity.Doctor;
import com.example.Clinic.exception.ApiException;
import com.example.Clinic.respository.DoctorRepository;

import java.util.List;

public class DoctorService {
    private final DoctorRepository doctorRepository = new DoctorRepository();

    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(Long id) {
        Doctor doctor = doctorRepository.findById(id);
        if (doctor == null) {
            throw new ApiException("Doctor not found with ID: " + id);
        }
        return doctor;
    }
}
