package com.example.Clinic.respository;

import com.example.Clinic.entity.Doctor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoctorRepository {
    public final Map<Long, Doctor> docMap=new HashMap<>();

    public Doctor save(Doctor doctor){
        docMap.put(doctor.getId(),doctor);
        return doctor;
    }

    public List<Doctor> findAll(){
        return new ArrayList<>(docMap.values());
    }

    public Doctor findById(Long id){
        return docMap.get(id);
    }

}
