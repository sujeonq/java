package test05;

public class Subject {
	String subName;
	Student[] students;
	int studentCount;

	public Subject(String subName) {
		this.subName = subName;
		this.students = new Student[10];
		this.studentCount = 0;
	}

	public void addStudent(Student student) {
		if (studentCount < students.length) {
			students[studentCount] = student;
			studentCount++;
		} else {
			System.out.println(subName + " - 더 이상 학생을 수강신청 받을 수 없습니다.");
		}
	}

	public void printSubjectInfo() {
		System.out.println("과목명 : " + subName);
		System.out.print("수강생 : ");
		for (int i = 0; i < studentCount; i++) {
			System.out.print(students[i].getName() + ", ");
		}
		System.out.println();
	}

	public String getName() {
		return subName;
	}
}