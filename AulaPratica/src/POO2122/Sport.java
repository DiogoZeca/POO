package POO2122;

public class Sport extends Activity {

     public static enum Modality {
        KAYAK, HIKING, BIKE, BOWLING;
    }

    private Modality modality;

    public Sport(Modality modality, int participants){
        super(participants, 30);
        this.modality = modality;
    }

    public Modality getModality() {
        return modality;
    }

    public void setModality(Modality modality) {
        this.modality = modality;
    }


    @Override 
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!super.equals(obj)) return false;

        Sport sport = (Sport) obj;
        return this.getModality() == sport.getModality();
    }

    @Override 
    public String toString() {
        return String.format("\t%s sporting activity with %s participants.", this.getModality(), this.getParticipants());
    }
}
