package test10;

import java.util.ArrayList;
import java.util.List;

public class Order {
    int orderNo;
    Customer customer;
    List<Product> products = new ArrayList<>();
    
    public Order(int orderNo, Customer customer) {
        this.orderNo = orderNo;
        this.customer = customer;
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public int getOrderNo() {
        return orderNo;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
    public int getTotalPrice() {
        int total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
