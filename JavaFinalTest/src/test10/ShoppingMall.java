package test10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingMall {
    List<Customer> customers = new ArrayList<>();
    List<Order> orders = new ArrayList<>();
    Map<String, List<Order>> customerOrders = new HashMap<>();
    
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    public void addOrder(Order order) {
        orders.add(order);
        String uid = order.getCustomer().getUid();
        if (!customerOrders.containsKey(uid)) {
            customerOrders.put(uid, new ArrayList<>());
        }
        customerOrders.get(uid).add(order);
    }
    
    public List<Order> getOrders() {
        return orders;
    }
}
