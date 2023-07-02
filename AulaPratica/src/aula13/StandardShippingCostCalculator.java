package aula13;

public class StandardShippingCostCalculator implements ShippingCostCalculator {
    private double costPerKg;

    public StandardShippingCostCalculator(double costPerKg) {
        this.costPerKg = costPerKg;
    }

    @Override
    public double calculateShippingCost(Package pkg) {
        double weight = pkg.getWeight();
        return weight * costPerKg;
    }
}