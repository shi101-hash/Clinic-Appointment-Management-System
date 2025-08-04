package com.example.Clinic.respository;

import com.example.Clinic.entity.Appointment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AppointmentRepository {
    private final Map<Long, Appointment> appointmentMap = new ConcurrentHashMap<>();

    public Appointment save(Appointment appointment) {
        appointmentMap.put(appointment.getId(), appointment);
        return appointment;
    }

    public List<Appointment> findAll() {
        return new ArrayList<>(appointmentMap.values());
    }

    public List<Appointment> findByDoctorId(Long doctorId) {
        List<Appointment> result = new ArrayList<>();
        for (Appointment appointment : appointmentMap.values()) {
            if (appointment.getDoctorId().equals(doctorId)) {
                result.add(appointment);
            }
        }
        return result;
    }
    public boolean isSlotBooked(Long doctorId, LocalDateTime slot) {
        return appointmentMap.values().stream()
                .anyMatch(a -> a.getDoctorId().equals(doctorId) && a.getSlot().equals(slot));
    }
}
