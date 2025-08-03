package com.example.Clinic.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Data
public class Doctor {
    private static final AtomicLong ID_GENERATOR = new AtomicLong();

    private Long id;
    private String name;
    private String specialization;
    private List<LocalDateTime> availableSlots;

    public Doctor(String name, String specialization, List<LocalDateTime> availableSlots) {
        this.id = ID_GENERATOR.incrementAndGet();
        this.name = name;
        this.specialization = specialization;
        this.availableSlots = availableSlots;
    }

    public Doctor() {}

}
