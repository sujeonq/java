package test3;

import java.security.PublicKey;

/*
 * 날짜 : 2024/07/11
 * 이름 : 박수정
 * 내용 : 다형성 연습문제
 */
class Product {
	protected String category;
	protected int price;

	public Product(String category, int price) {
		this.category = category;
		this.price = price;
	}

	public void info() {
		// TODO Auto-generated method stub

	}

	public void Product() {
	}
}

class Television extends Product {
	public Television(String category, int price) {
		super(category, price);
	}

	@Override
	public void info() {
		System.out.println("제품분류 : " + category);
		System.out.println("제품가격 : " + price);
	}
}

class Computer extends Product {
	public Computer(String category, int price) {
		super(category, price);
	}

	@Override
	public void info() {
		System.out.println("제품분류 : " + category);
		System.out.println("제품가격 : " + price);
	}
}

public class Test08 {
	public static void main(String[] args) {
		Product p1 = new Television("가전", 100);
		Product p2 = new Computer("컴퓨터", 150);

		p1.info();
		p2.info();
	}

}
