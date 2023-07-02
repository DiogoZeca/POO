package POO2122;

public abstract class Activity {
    
    int participants;
    double price;

    public Activity(int participants, double price) {
        this.participants = participants;
        this.price = price;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
        public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Activity act = (Activity) obj;
        return this.getParticipants() == act.getParticipants() && this.getPrice() == act.getPrice();
        }
}

