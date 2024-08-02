package test06;

public class Patient {
	String name;
	String id;
	int age;
	String diagnosis;
	
	public Patient(String name, String id, int age, String diagnosis) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.diagnosis = diagnosis;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", id=" + id + ", age=" + age + ", diagnosis=" + diagnosis + "]";
	}
	
	
	

}
