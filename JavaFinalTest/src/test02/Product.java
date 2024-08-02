package test02;

public class Product {
	private String productId;
	private String productName;
	private int productPrice;
	private int productStock;

	public Product(String productId, String productName, int price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = price;
		this.productStock = quantity;
	}

	public void updatePrice(int newPrice) {
		this.productPrice = newPrice;
		System.out.println(productName + " 가격 수정 됨");
	}

	public void addStock(int additionalStock) {
		this.productStock += additionalStock;
		System.out.println(productName + " " + additionalStock + "개 재고 추가 됨");
	}

	public void printProductInfo() {
		System.out.println("상품 ID : " + productId);
		System.out.println("상품이름 : " + productName);
		System.out.println("상품가격 : " + productPrice);
		System.out.println("재고수량 : " + productStock);
	}
}