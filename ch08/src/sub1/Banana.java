package sub1;

public class Banana {

	private String Country;
	private int price;

	public Banana(String country, int price) {
		super();
		Country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Banana [Country=" + Country + ", price=" + price + "]";
	}

}
