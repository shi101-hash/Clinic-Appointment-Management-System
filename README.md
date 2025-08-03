# Clinic-Appointment-Management-System

This is a Clinic Management Backend application built using Spring Boot. It allows managing Doctors, Patients, and Appointments through REST APIs.

#Technologies
- java 17
- Spring Boot
- Lombok
- Maven
- Postman for testing

#Features that i have added

Doctor Management
- Add a new doctor
- Get all doctors
- Get doctor by ID
- Delete doctor by ID

 Patient Management
- Add a new patient
- Get all patients

Appointment Management
- Book an appointment between doctor and patient
- Get all appointments
- Get all appointments for a doctor
  
Sample JSON
 Add a doctor:

{
  "name": "Dr. Shifa",
  "specialization": "Neurologist",
  "availableSlots": [
    "2025-08-03T10:00",
    "2025-08-03T11:00"
  ]
}

Add a patient:

{
  "name": "Saniya Siddiqui",
  "age": 24,
  "gender": "Female"
}



