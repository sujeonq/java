package ch07.sec09;

public class InstanceofExample {

	// main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();

		// stundet 변수에 대입(타입 변환 발생)
		if (person instanceof Student student) {
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
	}

	public static void main(String[] args) {
		// Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		Person p1 = new Person("홍길동");
		personInfo(p1);

		System.out.println();

		// Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
	}

}
