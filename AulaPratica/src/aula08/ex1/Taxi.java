package aula08.ex1;

public class Taxi extends AutomovelLigeiro {

    private int numeroLicenca;

    public Taxi(String marca, String modelo, String matricula, int potencia, int numeroDoQuadro, int capacidadeMala, int numeroLicenca) {
        super(marca, modelo, matricula, potencia, numeroDoQuadro, capacidadeMala);
        this.numeroLicenca = numeroLicenca;
    }

    public int getNumeroLicenca() {
        return numeroLicenca;
    }

    public void setNumeroLicenca(int numeroLicenca) {
        this.numeroLicenca = numeroLicenca;
    }

    @Override
    public String toString() {
        return "Taxi{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", potenciaCv=" + getPotencia() + ", numeroDoQuadro=" + getNumeroDoQuadro() + ", capacidadeMala=" + getCapacidadeMala() + ", numeroLicenca=" + numeroLicenca + '}'+ '\n' ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        final Taxi other = (Taxi) obj;
        return super.equals(obj) && this.getNumeroLicenca() == other.getNumeroLicenca();
    }
    
}
