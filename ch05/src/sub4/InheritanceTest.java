package sub4;

/*
 * 날짜 : 2024/07/09
 * 이름 : 박수정
 * 내용 : 클래스 상속 실습하기
 */
public class InheritanceTest {

	public static void main(String[] args) {

		// 상속 객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUp(100);
		sonata.speedDown(40);
		sonata.show();

		Truck bongo = new Truck("봉고", "남색", 0, 1000);
		bongo.speedUp(100);
		bongo.speedDown(40);
		bongo.show();

		// StockAccount 실습(bank, acc, name, balance, stock, amount, price)
		StockAccount kb = new StockAccount("KB증권", "101-11-1001", "홍길동", 10000, "삼성전자", 10, 50000);
		kb.deposit(1000000);
		kb.buy(20, 50000); // amount, price
		kb.sell(10, 50000); // amount, price
		kb.show();

		Doctor d = new Doctor("박수정", 25, "외과");
		d.work();

		Engineer e = new Engineer("정수박", 30, "소프트웨어");
		e.work();

	}

}
