package AvaliaçãoUltimaAula;

public class Item {
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name + ":" + price;
    }

}
