package test2;

/*
 * 날짜 : 2024/07/05
 * 이름 : 박수정
 * 내용 : 자바 팩토리얼 재귀 매서드 연습문제
 */

public class Test08 {
	public static void main(String[] args) {

		System.out.println("3! = " + factorial(3));
		System.out.println("4! = " + factorial(4));
		System.out.println("5! = " + factorial(5));
	}

	public static int factorial(int n) {

		if (n <= 1) {
			return 1;
		}

		return n * factorial(n - 1);

	}

}
