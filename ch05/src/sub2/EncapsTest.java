package sub2;

import sub2.Account;

/*
 * 날짜 : 2024/07/08
 * 이름 : 박수정
 * 내용 : 캡슐화 실습하기
 */
public class EncapsTest {
	public static void main(String[] args) {

		// car 객체 생성과 초기화
		Car sonata = new Car("소나타", "흰색", 0);

		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.setColor("은색");
		sonata.show();

		Car avante = new Car("아반테", "검은색", 0);

		avante.speedUp(100);
		avante.speedDown(40);
		avante.show();

		// Account 객체 생성과 초기화
		/*
		 * 은행명 : 국민은행 계좌번호 : 101-21-1001 입금주 : 김유신 현재잔액 : 20000
		 */

		// Account 실습
		// kb 객체 생성과 초기화
		Account kb = new Account("국민은행", "101-21-1001", "김유신", 10000);

		kb.deposit(40000);
		kb.withdraw(30000);
		// 김유신 -> 김유진으로 개명
		kb.setName("김유진");
		kb.show();

		// wr 객체 생성과 초기화
		Account wr = new Account("우리은행", "101-22-1001", "김춘추", 10000);

		wr.deposit(20000);
		wr.withdraw(15000);
		// 우리은행 -> 유리은행 상호 변경
		wr.setBank("유리은행");
		wr.show();

		System.out.println(); // 개행처리

		// 클래스 연습문제
		Book java = new Book("이것이 자바다", "신용권", "121-11-1001", 3);
		Book sql = new Book("혼자 공부하는 SQL", "우재남", "112-10-1102", 2);

		if (java.borrowBook()) {
			System.out.println("대출 성공");

		} else {
			System.out.println("대출 실패");
		}

		System.out.println("남은 도서 수 : " + java.getAvailableCopies());
		java.show();
	}

}
