package ch07.sec07.exam2;

public class Child extends Parent {

	// 메소드 오버라이딩
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}

	// 메소드 선언
	private void method3() {
		System.out.println("Child-method3()");
	}
}
