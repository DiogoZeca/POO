package aula08.ex1;

public class PesadoPassageiros extends Pesado {

    private int numeroDePassageiros;

    public PesadoPassageiros(String marca, String modelo, String matricula, int potencia, int peso, int numeroDoQuadro, int numeroDePassageiros){
        super(marca, modelo, matricula, potencia, peso, numeroDoQuadro);
        validarNumeroDePassageiros(numeroDePassageiros);
        this.numeroDePassageiros = numeroDePassageiros;
    }

    public int getNumeroDePassageiros(){
        return numeroDePassageiros;
    }

    public void setNumeroDePassageiros(int numeroDePassageiros){
        validarNumeroDePassageiros(numeroDePassageiros);
        this.numeroDePassageiros = numeroDePassageiros;
    }

    private void validarNumeroDePassageiros(int numeroDePassageiros){
        if(numeroDePassageiros <= 0){
            throw new IllegalArgumentException("Número de passageiros inválido");
        }
    }

    @Override
    public String toString() {
        return "PesadoPassageiros{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", potenciaCv=" + getPotencia() + ", numeroDoQuadro=" + getNumeroDoQuadro() + ", peso=" + getPeso() + ", numeroDePassageiros=" + numeroDePassageiros + '}' + '\n';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final PesadoPassageiros other = (PesadoPassageiros) obj;
        return super.equals(obj) && this.getNumeroDePassageiros() == other.getNumeroDePassageiros();
    }
    
    
}
