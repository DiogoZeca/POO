package aula09.ex3;


public class MilitaryPlane extends Plane {
    private int num_mun;
    public MilitaryPlane(String ind, String fab, String mod, int ano, int num_max, int vel_max, int num_mun) {
        super(ind, fab, mod, ano, num_max, vel_max);
        this.num_mun = num_mun;
    }
    public int getNum_mun() {
        return num_mun;
    }
    public void setNum_mun(int num_mun) {
        this.num_mun = num_mun;
    }
    @Override
    public String getPlaneType() {
        return "Militar";
    }
    @Override
    public String toString() {
        return "MilitaryPlane [num_mun=" + num_mun + "]";
    }
    
}
