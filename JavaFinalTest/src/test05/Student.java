package test05;

public class Student {
	String name;
	String studentId;
	Subject[] subjects;
	int[] scores;
	int subjectCount;

	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}

	public void enrollSubject(Subject subject) {
		if (subjectCount < subjects.length) {
			subjects[subjectCount] = subject;
			subject.addStudent(this);
			System.out.println(name + " - " + subject.getName() + " 과목 신청완료");
			subjectCount++;
		} else {
			System.out.println(name + " - 더 이상 과목을 신청할 수 없습니다.");
		}
	}

	public void setScore(Subject subject, int score) {
		for (int i = 0; i < subjectCount; i++) {
			if (subjects[i] == subject) {
				scores[i] = score;
				System.out.println(name + " - " + subject.getName() + " 점수 입력완료");
				return;
			}
		}
		System.out.println(name + " - " + subject.getName() + " 과목을 수강하지 않았습니다.");
	}

	public void printStudentInfo() {
		System.out.println("학생명 : " + name);
		System.out.println("아이디 : " + studentId);
		System.out.println("성적");
		for (int i = 0; i < subjectCount; i++) {
			System.out.println("- " + subjects[i].getName() + ":" + scores[i]);
		}
	}

	public String getName() {
		return name;
	}
}
