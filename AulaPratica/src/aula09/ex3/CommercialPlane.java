package aula09.ex3;

public class CommercialPlane extends Plane {
    private int num_trip;
    public CommercialPlane(String ind, String fab, String mod, int ano, int num_max, int vel_max, int num_trip) {
        super(ind, fab, mod, ano, num_max, vel_max);
        this.num_trip = num_trip;
    }
    public int getNum_trip() {
        return num_trip;
    }
    public void setNum_trip(int num_trip) {
        this.num_trip = num_trip;
    }
    @Override
    public String getPlaneType() {
        return "Comercial";
    }
    @Override
    public String toString() {
        return "CommercialPlane [num_trip=" + num_trip + "]";
    }
}
