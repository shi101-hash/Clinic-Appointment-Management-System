package com.example.Clinic.service;


import com.example.Clinic.entity.Appointment;
import com.example.Clinic.entity.Doctor;
import com.example.Clinic.entity.Patient;
import com.example.Clinic.exception.ApiException;
import com.example.Clinic.respository.AppointmentRepository;

import java.time.LocalDateTime;
import java.util.List;

public class AppointmentService {
    private final AppointmentRepository appointmentRepository = new AppointmentRepository();
    private final DoctorService doctorService;
    private final PatientService patientService;

    public AppointmentService(DoctorService doctorService, PatientService patientService) {
        this.doctorService = doctorService;
        this.patientService = patientService;
    }

    public Appointment bookAppointment(Long doctorId, Long patientId, LocalDateTime slot) {
        Doctor doctor = doctorService.getDoctorById(doctorId);
        Patient patient = patientService.getPatientById(patientId);

        if (!doctor.getAvailableSlots().contains(slot)) {
            throw new ApiException("Doctor is not available at this slot.");
        }

        if (appointmentRepository.isSlotBooked(doctorId, slot)) {
            throw new ApiException("Slot already booked for doctor ID: " + doctorId);
        }

        return appointmentRepository.save(new Appointment(doctorId, patientId, slot));
    }

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public List<Appointment> getAppointmentsByDoctor(Long doctorId) {
        return appointmentRepository.findByDoctorId(doctorId);
    }
}
