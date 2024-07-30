package ch05.sec04;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		int[] intArray = new int[1];
		intArray[0] = 10;
		System.out.println("배열 첫 번째 요소: " + intArray[0]);

		String str = "Hello";
		System.out.println("총 문자 수: " + str.length());
	}
}

/*
 * int[] intArray = null; intArray[0]=10;
 * String str = null; System.out.println("총 문자 수: "+str.length());
 */