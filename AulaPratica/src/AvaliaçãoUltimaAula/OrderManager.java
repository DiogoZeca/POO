package AvaliaçãoUltimaAula;

import java.util.ArrayList;

public class OrderManager {
    private ArrayList<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void removeOrder(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                orders.remove(order);
                break;
            }
        }
    }

    public Order searchOrder(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public double calculateOrderCost(int id) {

        StandardOrderCostCalculator calculator = new StandardOrderCostCalculator();

        Order order = searchOrder(id);
        if (order == null){
            return -1;
        }
        return calculator.calculateOrderCost(order);
    }

    public void printAllOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public double calculateMonthCost(int month) {

        StandardOrderCostCalculator calculator = new StandardOrderCostCalculator();
        double total = 0;
        
        for (Order order : orders) {
            if (order.getOrderDateTime().getMonthValue() == month) {
                total += calculator.calculateOrderCost(order);
            }
        }
        return total;
    }
}
