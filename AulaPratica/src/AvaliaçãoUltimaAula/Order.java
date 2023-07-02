package AvaliaçãoUltimaAula;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private int id;
    private String storeId;
    private String clientId;
    private LocalDateTime orderDateTime;
    private boolean expresso;
	private ArrayList<Item> itens;
	private static int nextId = 1;

    public Order(ArrayList<Item> itens, String storeId, String clientId, LocalDateTime orderDateTime, boolean expresso) {
        this.id = nextId++;
        this.itens = itens;
        this.storeId = storeId;
        this.clientId = clientId;
        this.orderDateTime = orderDateTime;
        this.expresso = expresso;
    }

    public double TotalValue() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPrice();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public LocalDateTime getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(LocalDateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	public boolean getExpresso() {
		return expresso;
	}

	public void setExpresso(boolean expresso) {
		this.expresso = expresso;
	}

    @Override
    public String toString() {
        return "Order [id=" + id + ", itens=" + itens + ", storeId=" + storeId + ", clientId=" + clientId + ", orderDateTime=" + orderDateTime + ", expresso=" + expresso + "]";
    }

}
