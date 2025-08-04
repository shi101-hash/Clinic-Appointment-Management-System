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
  
#API Testing with cURL

##Add a doctor:
 
curl --location 'localhost:8080/doctors' \
--header 'Content-Type: application/json' \
--data '{
  "name": "Dr. Arshi",
  "specialization": "Neurologist",
  "availableSlots": [
    "2025-08-06T07:00",
    "2025-08-06T08:00"
  ]
  }'

##Get All doctors

curl --location 'localhost:8080/doctors' \
--data ''

##Get Doctor ById

curl --location 'localhost:8080/doctors/1' \
--data ''

##Add a patient:

curl --location 'localhost:8080/patients' \
--header 'Content-Type: application/json' \
--data '    {
        
        "name": "Ayaan",
        "age": 30,
        "gender":"Male"
    }'

##Get Patients

curl --location 'localhost:8080/patients' \
--data ''

##Book Appointment

curl --location --request POST 'localhost:8080/appointments?doctorId=1&patientId=1&slot=2025-08-06T12%3A00' \
--data ''
