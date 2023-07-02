package aula08.ex1;

public class AutomovelLigeiroEletrico extends AutomovelLigeiro implements VeiculoEletrico {

    private int autonomiaTotal;
    private int carga = 100;

    public AutomovelLigeiroEletrico(String marca, String modelo, String matricula, int potencia, int numeroDoQuadro, int capacidadeMala, int autonomiaTotal, int carga) {
        super(marca, modelo, matricula, potencia, numeroDoQuadro, capacidadeMala);
        this.autonomiaTotal = autonomiaTotal;
        this.carga = carga;
    }

    
    public AutomovelLigeiroEletrico(String marca, String modelo, String matricula, int potencia, int numeroDoQuadro, int capacidadeMala, int autonomiaTotal) {
        super(marca, modelo, matricula, potencia, numeroDoQuadro, capacidadeMala);
        this.autonomiaTotal = autonomiaTotal;
    }

    public int maxautonomia() {
        return this.autonomiaTotal;
    }

    public int autonomia(){
        return this.autonomiaTotal * (carga / 100);
    }

    public void carregarBateria(int percentagem){
        this.carga += percentagem;
        if (this.carga > 100) this.carga = 100;
    }

    public int getCarga(){
        return this.carga;
    }

    @Override
    public String toString() {
        return "AutomovelLigeiroEletrico{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", potenciaCv=" + getPotencia() + ", numeroDoQuadro=" + getNumeroDoQuadro() + ", capacidadeMala=" + getCapacidadeMala() + ", autonomiaTotal=" + autonomiaTotal + ", carga=" + carga + '}' + '\n';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        final AutomovelLigeiroEletrico other = (AutomovelLigeiroEletrico) obj;
        return super.equals(obj) && this.autonomiaTotal == other.autonomiaTotal && this.carga == other.carga;
    }

}
