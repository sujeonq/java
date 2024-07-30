package sub2;

/*
 * 날짜 : 2024/07/02
 * 이름 : 박수정
 * 내용 : Java 매서드 실습하기
 */
public class MethodTest {

	// main 매서드 - 프로그램 진입점
	public static void main(String[] args) {

		// 매서드 호출(call)
		int y1 = f(1); // 인자값 1을 전달해서 f메서드 호출
		int y2 = f(2);
		int y3 = f(3);

		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);

		int result1 = sum(1, 10);
		System.out.println("result1 : " + result1);

		int result2 = sum(1, 100);
		System.out.println("result2 : " + result2);
	}

	// 매서드 정의(define)
	public static int f(int x) { // 전달되는 인자값을 매개변수 x로 받아서 매서드 실행
		int y = 2 * x + 3;
		return y; // 매서드를 호출한 곳으로 반환값 전달
	}

	// 매서드 정의
	public static int sum(int start, int end) {

		// 지역변수 : 매서드 안에서 선언된 변수
		int total = 0;

		for (int k = start; k <= end; k++) {

			total += k;
		}

		return total;
	}

}
