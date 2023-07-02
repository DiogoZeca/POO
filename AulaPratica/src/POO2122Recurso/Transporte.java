package POO2122Recurso;

public class Transporte extends Servico  {

    private int numeroDeOcupantes;
    private int KmMaximos;
    private Combustivel combustivel;

    public Transporte(int numeroDeOcupantes, int kmMaximos, Combustivel combustivel) {
        super("TRAS");
        this.numeroDeOcupantes = numeroDeOcupantes;
        KmMaximos = kmMaximos;
        this.combustivel = combustivel;
    }


    public int getNumeroDeOcupantes() {
        return numeroDeOcupantes;
    }

    public void setNumeroDeOcupantes(int numeroDeOcupantes) {
        if (numeroDeOcupantes > 0) {
            this.numeroDeOcupantes = numeroDeOcupantes;
        }
    }

    public int getKmMaximos() {
        return KmMaximos;
    }

    public void setKmMaximos(int kmMaximos) {
        if (kmMaximos > 0) {
            KmMaximos = kmMaximos;
        }
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        if (combustivel instanceof Combustivel) {
            this.combustivel = combustivel;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Transporte) {
            Transporte t = (Transporte) o;
            return this.numeroDeOcupantes == t.getNumeroDeOcupantes() && this.KmMaximos == t.getKmMaximos() && this.combustivel.equals(t.getCombustivel());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Transporte{" +
                "numeroDeOcupantes=" + numeroDeOcupantes +
                ", KmMaximos=" + KmMaximos +
                ", combustivel=" + combustivel +
                '}';
    }
    
}
