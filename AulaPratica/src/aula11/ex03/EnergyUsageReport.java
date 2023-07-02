package aula11.ex03;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class EnergyUsageReport {
    Map<Integer, Customer> customers = new HashMap<>();
    public boolean load(String fileName) throws FileNotFoundException {
        int customerId;
        Scanner sc = new Scanner( new FileReader(fileName) );
        while(sc.hasNext()){
            List<Double> meterReadings = new ArrayList<>();
            customerId = sc.nextInt();
            while(sc.hasNextDouble()){
                meterReadings.add(sc.nextDouble());
            }
            customers.put(customerId, new Customer(customerId, meterReadings));
        }
        sc.close();
        return true;
    }

    public void addCustomer(Customer newCustomer){
        customers.put(newCustomer.getCustomerId(), newCustomer);
    }

    public void removeCustomer(int customerId){
        if(customers.containsKey(customerId)){
            customers.remove(customerId);
        }
        else{
            System.out.println("Cliente não listado");
        }
    }

    public Customer getCustomer(int customerId){
        if(customers.get(customerId) != null){
            return new Customer(customerId, customers.get(customerId).getMeterReadings());
        }
        return null;
    }

    public double calculateTotalUsage(int customerId){
        double total = 0;
        for (double consumo : customers.get(customerId).getMeterReadings()) {
            total += consumo;
        }
        return total;
    }

    public String generateReport(String fileName){
        String report = "";
        for (Map.Entry<Integer, Customer> entry : customers.entrySet()) {
            report += "Customer ID: " + entry.getKey() + "\n";
            report += "Total Usage: " + calculateTotalUsage(entry.getKey()) + "\n";
        }
        return report;
    }   
}
