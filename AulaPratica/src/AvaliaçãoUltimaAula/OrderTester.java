package AvaliaçãoUltimaAula;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderTester {
    public static void main(String[] args) {

        OrderManager manager = new OrderManager();
        readOrders(manager, "pedidos.txt");

        manager.printAllOrders();
        System.out.println("Escolha um pedido");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        Order order = manager.searchOrder(id);
        System.out.println("Pedido " + id + ": " + order);
        System.out.println("Custo do Pedido: " + manager.calculateOrderCost(id));
        System.out.println("Escolha um mês");
        int month = sc.nextInt();
        System.out.println("Custo do Mês " + month + ": " + manager.calculateMonthCost(month));
        sc.close();

        printOrders(manager, "PedidosImpressos.txt");
    }

    public static void readOrders(OrderManager manager, String filename){
        Scanner sc;
        try {
            sc = new Scanner(new FileReader(filename, StandardCharsets.UTF_8));
        } catch (Exception e) {
            return;
        }
        sc.nextLine();
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            line = line.strip();

            String[] parts = line.split(";");
			int clientId = Integer.parseInt(parts[0]);
			int storeId = Integer.parseInt(parts[1]);
			String itensString = parts[2];
			LocalDateTime dateTime = LocalDateTime.parse(parts[3], formatter);
			boolean isExpresso = parts[4] == "expresso";

			ArrayList<Item> itensList = new ArrayList<Item>();
			String[] itens = itensString.split("\\|");
			for (String item : itens) {
				String[] itemPart = item.split(":");
				itensList.add(new Item(itemPart[0], Double.parseDouble(itemPart[1])));
			}
			Order ord = new Order(itensList, Integer.toString(storeId), Integer.toString(clientId), dateTime, isExpresso);
			manager.addOrder(ord);
        }
    }

    public static void printOrders(OrderManager manager, String filename) {
		try (FileWriter fw = new FileWriter(filename, StandardCharsets.UTF_8)) {
            for (Order order : manager.getOrders()) {
                fw.write(order.getClientId() + ";");
                fw.write(order.getStoreId() + ";");
                for (Item item : order.getItens()) {
                    fw.write(item.toString());
					if (order.getItens().indexOf(item) != order.getItens().size() - 1) {
						fw.write("|");
					}
                }
                fw.write(";");
                fw.write(order.getOrderDateTime().format(formatter) + ";");
                fw.write(order.getExpresso() ? "expresso" : "normal");
                fw.write("\n");
            }
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
	}

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    
}
