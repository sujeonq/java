package test07;

public class Product {
	String prodId;
	String prodName;
	int price;
	int quantity;

	public Product(String prodId, String prodName, int price, int quantity) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}

	public void printProductInfo() {
		System.out.println("상품코드 : " + prodId);
		System.out.println("상품이름 : " + prodName);
		System.out.println("상품가격 : " + price);
		System.out.println("재고수량 : " + quantity);
	}
}