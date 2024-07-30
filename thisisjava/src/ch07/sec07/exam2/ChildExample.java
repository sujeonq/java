package ch07.sec07.exam2;

public class ChildExample {
	public static void main(String[] args) {
		// 자식 객체 생성
		Child child = new Child();

		// 자동 타입 변환
		Parent parents = child;

		// 메소드 호출
		parents.method1();
		parents.method2();
	}

}
