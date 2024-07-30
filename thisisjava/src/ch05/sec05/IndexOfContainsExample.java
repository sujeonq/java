package ch05.sec05;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";

		// "프로그래밍"이 시작되는 위치를 찾음
		int location = subject.indexOf("프로그래밍");
		System.out.println(location); // 3 출력

		// 위치부터 문자열 끝까지 자름
		String substring = subject.substring(location);
		System.out.println(substring); // "프로그래밍" 출력

		// "자바"가 있는지 확인
		location = subject.indexOf("자바");
		if (location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}

		// "자바"가 포함되어 있는지 확인
		boolean result = subject.contains("자바");
		if (result) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	}
}
