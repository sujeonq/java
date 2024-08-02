package test01;

public class StudentScore {
	String studentName;
	String studentId;
	String subject;
	double score;

	public StudentScore(String studentName, String studentId, String subject, double score) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}

	public void updateScore(double score) {
		if (score >= 0 && score <= 100) {
			this.score = score;
		} else {
			System.out.println("잘못된 점수 입력");
		}
	}

	public double getScore() {
		return this.score;
	}

	public void printStudentInfo() {
		System.out.println("학생이름 : " + studentName);
		System.out.println("학생 ID : " + studentId);
		System.out.println("과목 : " + subject);
		System.out.println("점수 : " + score);
	}

}