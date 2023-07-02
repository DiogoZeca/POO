package AvaliaçãoUltimaAula;

public class StandardOrderCostCalculator implements OrderCostCalculator {

    @Override
    public double calculateOrderCost(Order order) {

        double total = order.TotalValue();
        
        if (order.getExpresso()){
            total *= 1.3;
        }
        return total;
    }
    
}
