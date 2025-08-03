package com.example.Clinic.entity;

import lombok.Data;

import java.util.concurrent.atomic.AtomicLong;

@Data
public class Patient {
    private static final AtomicLong ID_GENERATOR=new AtomicLong();


    private Long id;
    private String name;
    private int age;
    private String gender;

    public Patient(String name,int age,String gender){
        this.id=ID_GENERATOR.incrementAndGet();
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

}
