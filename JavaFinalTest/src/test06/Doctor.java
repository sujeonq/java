package test06;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	String name;
	String id;
	String special;
	List<Patient> patients;
	
	public Doctor(String name, String id, String special) {
		this.name = name;
		this.id = id;
		this.special = special;
		this.patients = new ArrayList<Patient>();
	}
	
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("의사: " + name + "(ID: " + id + ", 전문분야: " + special + ")\n");
        result.append("담당 환자 목록:\n");
        for (Patient patient : patients) {
            result.append("- " + patient + "\n");
        }
        return result.toString();
    }
}