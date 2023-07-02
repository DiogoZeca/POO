package aula08.ex1;

public class PesadoPassageirosEletrico extends PesadoPassageiros implements VeiculoEletrico {

    private int autonomiaTotal;
    private int carga = 100;
    
    public PesadoPassageirosEletrico(String marca, String modelo, String matricula, int potencia, int peso, int numeroDoQuadro, int capacidade, int autonomiaTotal, int carga) {
        super(marca, modelo, matricula, potencia, peso, numeroDoQuadro, capacidade);
        this.autonomiaTotal = autonomiaTotal;
        this.carga = carga;
    }

    public PesadoPassageirosEletrico(String marca, String modelo, String matricula, int potencia, int peso, int numeroDoQuadro, int capacidade, int autonomiaTotal) {
        super(marca, modelo, matricula, potencia, peso, numeroDoQuadro, capacidade);
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

    public void setCarga(int carga){
        this.carga = carga;
    }

    public int getAutonomiaTotal(){
        return this.autonomiaTotal;
    }

    public void setAutonomiaTotal(int autonomiaTotal){
        this.autonomiaTotal = autonomiaTotal;
    }

    public int getCapacidade(){
        return this.getCapacidade();
    }

    public void setCapacidade(int capacidade){
        this.setCapacidade(capacidade);
    }

    @Override
    public String toString() {
        return "PesadoPassageirosEletrico{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", potenciaCv=" + getPotencia() + ", numeroDoQuadro=" + getNumeroDoQuadro() + ", peso=" + getPeso() + ", capacidade=" + getCapacidade() + ", autonomiaTotal=" + autonomiaTotal + ", carga=" + carga + '}' + '\n';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        final PesadoPassageirosEletrico other = (PesadoPassageirosEletrico) obj;
        return super.equals(obj) && this.autonomiaTotal == other.autonomiaTotal && this.carga == other.carga;
    }
}
