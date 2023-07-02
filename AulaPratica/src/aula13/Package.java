package aula13;

public class Package {
    private static int id = 0;
    private double weight;
    private String sender;
    private String destination;
    private int idm;

    public Package(double weight, String sender, String destination) {
        idm = id++;
        this.weight = weight;
        this.sender = sender;
        this.destination = destination;
    }

    public int getIdm() {
        return idm;
    }

    public void setId(int idm) {
        this.idm = idm;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
    return "Package ID: " + idm + "\nWeight: " + weight + "\nSender: " + sender + "\nDestination: " + destination;   
    }   
}