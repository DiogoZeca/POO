package aula08.ex1;

public class Motociclo extends Veiculo{

    private String tipo;

    public Motociclo(String marca, String modelo, String matricula, int potencia, String tipo) {
        super(marca, modelo, matricula, potencia);
        validarTipo(tipo);
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        validarTipo(tipo);
        this.tipo = tipo;
    }
    
    private void validarTipo(String tipo){
        if(tipo == null || tipo.isEmpty()){
            throw new IllegalArgumentException("Tipo inválido");
        }
    }

    @Override
    public String toString() {
        return "Motociclo{" + "tipo=" + tipo + '}' + '\n';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;

        final Motociclo other = (Motociclo) obj;
        return super.equals(obj) && this.getTipo().equals(other.getTipo());
    }


}
