package aula09.ex3;

public abstract class Plane {
    private String ind, fab, mod;
    private int ano, num_max, vel_max;
    public Plane(String ind, String fab, String mod, int ano, int num_max, int vel_max) {
        this.ind = ind;
        this.fab = fab;
        this.mod = mod;
        this.ano = ano;
        this.num_max = num_max;
        this.vel_max = vel_max;
    }
    public String getInd() {
        return ind;
    }
    public void setInd(String ind) {
        this.ind = ind;
    }
    public String getFab() {
        return fab;
    }
    public void setFab(String fab) {
        this.fab = fab;
    }
    public String getMod() {
        return mod;
    }
    public void setMod(String mod) {
        this.mod = mod;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getNum_max() {
        return num_max;
    }
    public void setNum_max(int num_max) {
        this.num_max = num_max;
    }
    public int getVel_max() {
        return vel_max;
    }
    public void setVel_max(int vel_max) {
        this.vel_max = vel_max;
    }

    public String getPlaneType(){
        return "";
    }
    
    @Override
    public String toString() {
        return "Plane [ind=" + ind + ", fab=" + fab + ", mod=" + mod + ", ano=" + ano + ", num_max=" + num_max
                + ", vel_max=" + vel_max + "]";
    }

}