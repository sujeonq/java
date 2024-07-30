package sub7;

/*
 * 날짜 : 2024/07/10
 * 이름 : 박수정
 * 내용 : 추상 클래스 실습하기
 */
public class AbstractTest {
	public static void main(String[] args) {

		// 추상클래스는 객체생성 x
		// Animal animal = new Animal();

		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal shark = new Shark();

		tiger.move();
		eagle.move();
		shark.move();

		tiger.hunt();
		eagle.hunt();
		shark.hunt();

	}

}
