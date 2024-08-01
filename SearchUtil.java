package cw;

import java.util.ArrayList;

public class SearchUtil {
    public static Order linearSearch(ArrayList<Order> orders, int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null;
    }
}
