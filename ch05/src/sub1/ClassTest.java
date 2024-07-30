package sub1;

/*
 * 날짜 : 2024/07/08
 * 이름 : 박수정
 * 내용 : 클래스와 객체 실습하기
 */
public class ClassTest {
	public static void main(String[] args) {

		// 객체 생성
		Car sonata = new Car();

		// 객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;

		// 객체 활용
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();

		// 두번째 객체 생성
		Car avente = new Car();
		avente.name = "아반테";
		avente.color = "검정";
		avente.speed = 0;

		avente.speedUp(80);
		avente.speedDown(20);
		avente.show();

		/*
		 * 은행명 : 국민은행 계좌번호 : 101-21-1001 입금주 : 김유신 현재잔액 : 20000
		 */

		// Account 객체 생성
		Account kb = new Account();

		// 객체 초기화
		kb.bank = "국민은행";
		kb.acc = "101-21-1001";
		kb.name = "김유신";
		kb.balance = 10000;

		// 객체 활용
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();

		/*
		 * 아래와 같이 출력되게 프로그래밍 하세요. 클래스 : Account 객체명 : wr 초기화 : 우리은행, 101-22-1001, 김춘추,
		 * 10000 입금액 : 20000
		 * 
		 * <출력> 은행명 : 우리은행 계좌번호 : 101-22-1001 입금주 : 김춘추 현재잔액 : 15000
		 */

		// Account 객체 생성
		Account wr = new Account();

		// 객체 초기화
		wr.bank = "우리은행";
		wr.acc = "101-22-1001";
		wr.name = "김춘추";
		wr.balance = 10000;

		// 객체 활용
		wr.deposit(20000); // deposit -> 입금
		wr.withdraw(15000); // withdraw -> 출금
		wr.show();

	}

}
