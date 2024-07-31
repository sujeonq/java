package shop.vo;

public class OrderVO {
	private int orderNo;
	private String orderId;
	private int orderProduct;
	private int orderCount;
	private String orderDate;

	public OrderVO() {

	}

	public OrderVO(int orderNo, String orderId, int orderProduct, int orderCount, String orderDate) {
		super();
		this.orderNo = orderNo;
		this.orderId = orderId;
		this.orderProduct = orderProduct;
		this.orderCount = orderCount;
		this.orderDate = orderDate;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public int getOrderProduct() {
		return orderProduct;
	}

	public void setOrderProduct(int orderProduct) {
		this.orderProduct = orderProduct;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "OrderVO [orderNo=" + orderNo + ", orderId=" + orderId + ", orderProduct=" + orderProduct
				+ ", orderCount=" + orderCount + ", orderDate=" + orderDate + "]";
	}

}
