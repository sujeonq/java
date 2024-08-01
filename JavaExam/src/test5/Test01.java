package test5;

/*
 * 날짜 : 2024/08/01
 * 이름 : 박수정
 * 내용 : 자바 총정리 연습문제
 */
public class Test01 {
	public static void main(String[] args) {
		char var1 = 'A';
		int var2 = (char) var1;
		char var3 = 'B';
		int var4 = (char) (var1 + var3);
		String var5 = """
				Hello World!
				Hello Korea!
				Hello Busan!
				""";

		/*
		 * """ 
		 * 여러 줄 문자열
		 * """ 
		 * 텍스트 블록을 사용하면 문자열을 여러 줄에 걸쳐 작성할 수 있습니다. 
		 * 줄바꿈과 공백을 그대로 유지합니다.
		 *  
		 */

		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println(var5);

		int a = 10;
		int b = 5;
		System.out.println(a > b || a == b);
		System.out.println(a < b && a == b);

		System.out.println(a > b ^ a == 10); // ^ 는 결과 값이 서로 다를때만 참을 반환
		System.out.println(a > b ^ a == b);

		System.out.println(a == b & test(1)); // 두 피연산자를 모두 평가
		System.out.println(a == b && test(2)); // 첫 번째 피연산자가 거짓이면 두 번째 피연산자는 평가X

		System.out.println(b > 0 & (a / b > 0));
		System.out.println(b > 0 && (a / b > 0));
	}

	public static boolean test(int n) {
		System.out.println("test(" + n + ") 실행...");
		return true;
	}
}