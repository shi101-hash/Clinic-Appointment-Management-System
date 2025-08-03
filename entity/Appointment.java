package com.example.Clinic.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Data
public class Appointment {
    private static final AtomicLong ID_GENERATOR = new AtomicLong();

    private Long id;
    private Long doctorId;
    private Long patientId;
    private LocalDateTime slot;

    public Appointment(Long doctorId, Long patientId, LocalDateTime slot) {
        this.id = ID_GENERATOR.incrementAndGet();
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.slot = slot;
    }
}
