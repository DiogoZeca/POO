package aula08.ex1;

public class PesadoMercadorias extends Pesado{

    private int cargaMaxima;

    public PesadoMercadorias(String marca, String modelo, String matricula, int potencia, int peso, int numeroDoQuadro, int cargaMaxima){
        super(marca, modelo, matricula, potencia, peso, numeroDoQuadro);
        validarCargaMaxima(cargaMaxima);
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaMaxima(){
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima){
        validarCargaMaxima(cargaMaxima);
        this.cargaMaxima = cargaMaxima;
    }

    private void validarCargaMaxima(int cargaMaxima){
        if(cargaMaxima <= 0){
            throw new IllegalArgumentException("Carga máxima inválida");
        }
    }

    @Override
    public String toString() {
        return "PesadoMercadorias{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", potenciaCv=" + getPotencia() + ", numeroDoQuadro=" + getNumeroDoQuadro() + ", peso=" + getPeso() + ", cargaMaxima=" + cargaMaxima + '}' + '\n';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final PesadoMercadorias other = (PesadoMercadorias) obj;
        return super.equals(obj) && this.getCargaMaxima() == other.getCargaMaxima();
    }
    
}
