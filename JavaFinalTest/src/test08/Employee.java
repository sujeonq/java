package test08;

public class Employee extends Person {
	String employeeId;
	String dept;
	int salary;

	public Employee(String name, String birth, String employeeId, String dept, int salary) {
		super(name, birth);
		this.employeeId = employeeId;
		this.dept = dept;
		this.salary = salary;
	}

	public void raiseSalary(int amount) {
		this.salary += amount;
	}

	public void changeDepartment(String newDeptartment) {
		this.dept = newDeptartment;
		System.out.println("부서 변경");
	}

	public void printEmployeeInfo() {
		printPersonInfo();
		System.out.println("직원 아이디 : " + employeeId);
		System.out.println("부서 : " + dept);
		System.out.println("급여 : " + salary);
	}
}