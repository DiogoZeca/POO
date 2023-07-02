package aula08.ex1;

public class AutomovelLigeiro extends Automovel {
    
    private int capacidadeMala;


    public AutomovelLigeiro(String marca, String modelo, String matricula, int potencia, int numeroDoQuadro, int capacidadeMala) {
        super(marca, modelo, matricula, potencia, numeroDoQuadro);
        this.capacidadeMala = capacidadeMala;
    }

    public int getCapacidadeMala() {
        return capacidadeMala;
    }

    public void setCapacidadeMala(int capacidadeMala) {
        this.capacidadeMala = capacidadeMala;
    }

    @Override
    public String toString() {
        return "AutomovelLigeiro{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", potenciaCv=" + getPotencia() + ", numeroDoQuadro=" + getNumeroDoQuadro() + ", capacidadeMala=" + capacidadeMala + '}' + '\n';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        final AutomovelLigeiro other = (AutomovelLigeiro) obj;
        return super.equals(obj) && this.capacidadeMala == other.capacidadeMala;
    }
    
}
