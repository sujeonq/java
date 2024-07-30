package test3;

/*
 * 날짜 : 2024/07/11
 * 이름 : 박수정
 * 내용 : 정적변수 연습문제
 */
class Student {
	private static int studentId = 20201000;
	private String studentName;
	private String major;
	private int grade;

	public Student(String studentName, String major, int grade) {
		this.studentId++;
		this.studentName = studentName;
		this.major = major;
		this.grade = grade;
	}

	public void StudentInfo() {
		System.out.println("===========");
		System.out.println("학번 : " + studentId);
		System.out.println("이름 : " + studentName);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("===========");
	}
}

public class Test04 {
	public static void main(String[] args) {

		Student kim = new Student("김유신", "국문과", 1);
		kim.StudentInfo();

		Student lee = new Student("이순신", "경제학과", 1);
		lee.StudentInfo();

		Student lim = new Student("임꺽정", "경영학과", 2);
		lim.StudentInfo();
	}

}
