package POO2122;

public class Catering extends Activity {

    public static enum Option{
        LIGHT_BITES, DRINKS_AND_SNACKS, FULL_MENU;
    }

    private Option type;

    public Catering( Option type, int participants){
        super(participants, 25);
        this.type = type;
    }

    public Option getType() {
        return type;
    }

    public void setType(Option type){
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;

        Catering other = (Catering) obj;
        return this.getType().equals(other.getType());
    }

    @Override
    public String toString() {
        return String.format("\t%s with %s participants.", this.getType(), this.getParticipants());
    }
    
}
