package POO2122;

public class Culture extends Activity {

    public static enum Option {
        ARCHITECTURAL_TOUR, RIVER_TOUR, ART_MUSEUM, WINE_TASTING;
    }

    private Option type;

    public Culture(Option type, int participants) {
        super(participants, 22);
        this.type = type;
    }

    public Option getType() {
        return type;
    }

    public void setType(Option type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Culture other = (Culture) obj;
        return this.getType().equals(other.getType());
    }

    @Override
    public String toString() {
        return String.format("\t%s with %s participants.", this.getType(), this.getParticipants());
    }



    
}
