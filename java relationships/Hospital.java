import java.util.*;

class Doctor {
    String name;
    Doctor(String name) {
        this.name = name;
    }
    void consult(Patient p) {
        System.out.println("Doctor " + name + " consults " + p.name);
    }
}

class Patient {
    String name;
    Patient(String name) {
        this.name = name;
    }
}

class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
    Hospital(String name) {
        this.name = name;
    }
    void addDoctor(Doctor d) {
        doctors.add(d);
    }
    void addPatient(Patient p) {
        patients.add(p);
    }
}

public class HospitalDoctorsPatients {
    public static void main(String[] args) {
        Hospital h = new Hospital("Apollo");
        Doctor d1 = new Doctor("Dr. A");
        Doctor d2 = new Doctor("Dr. B");
        Patient p1 = new Patient("Advita");
        Patient p2 = new Patient("Riya");
        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);
        d1.consult(p1);
        d2.consult(p2);
    }
}

