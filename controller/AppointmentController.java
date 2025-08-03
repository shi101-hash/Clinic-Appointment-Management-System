package com.example.Clinic.controller;

import com.example.Clinic.entity.Appointment;
import com.example.Clinic.service.AppointmentService;
import com.example.Clinic.service.DoctorService;
import com.example.Clinic.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController() {
        DoctorService doctorService = new DoctorService();
        PatientService patientService = new PatientService();
        this.appointmentService = new AppointmentService(doctorService, patientService);
    }

    @PostMapping
    public Appointment bookAppointment(
            @RequestParam Long doctorId,
            @RequestParam Long patientId,
            @RequestParam String slot // ISO format: "2025-08-02T15:30"
    ) {
        LocalDateTime dateTime = LocalDateTime.parse(slot);
        return appointmentService.bookAppointment(doctorId, patientId, dateTime);
    }

    @GetMapping
    public List<Appointment> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/doctor/{doctorId}")
    public List<Appointment> getAppointmentsByDoctor(@PathVariable Long doctorId) {
        return appointmentService.getAppointmentsByDoctor(doctorId);
    }
}
