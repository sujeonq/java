package test01;

public class StudentScore {
	String studentName;
	String studentId;
	String subject;
	double score;

	public StudentScore(String studentName, String studentId, String subject, double score) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void printStudentInfo() {
		printStudentInfo();

	}

	public void updateScore(double d) {
		if (score < 100.0) {
			System.out.println("점수 수정 완료");
			updateScore(d);

		} else {
			System.out.println("잘못된 점수 입력");

		}
	}

}
