package aula08.ex1;

public abstract class Pesado extends Automovel {

    private int peso;

    public Pesado(String marca, String modelo, String matricula, int potencia, int peso, int numeroDoQuadro){
        super(marca, modelo, matricula, potencia, numeroDoQuadro);
        validarPeso(peso);
        this.peso = peso;
    }

    public int getPeso(){
        return peso;
    }

    public void setPeso(int peso){
        validarPeso(peso);
        this.peso = peso;
    }

    private void validarPeso(int peso){
        if(peso <= 0){
            throw new IllegalArgumentException("Peso inválido");
        }
    }

    @Override
    public String toString() {
        return "Pesado{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", potenciaCv=" + getPotencia() + ", numeroDoQuadro=" + getNumeroDoQuadro() + ", peso=" + peso + '}' + '\n';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Pesado other = (Pesado) obj;
        return super.equals(obj) && this.getPeso() == other.getPeso();
    }
}
