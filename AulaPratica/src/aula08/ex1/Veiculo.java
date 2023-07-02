package aula08.ex1;

public abstract class Veiculo implements KmPercorridosInterface {

    private int potencia;
    private String modelo;
    private String marca;
    private String matricula;


    private int distanciaUltimoTrajeto = 0;
    private int distanciaTotal = 0;

    public Veiculo(String marca, String modelo, String matricula, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void trajeto(int km) {
        System.out.println("O veiculo " + this.getMatricula() + " percorreu " + km + " km");
        distanciaUltimoTrajeto = km;
        distanciaTotal += km;
    }

    public int distanciaTotal() {
        return distanciaTotal;
    }

    public int distanciaUltimoTrajeto() {
        return distanciaUltimoTrajeto;
    }

    @Override

    public String toString() {
        return "Veiculo{" +
                "potencia=" + potencia +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                ", distanciaUltimoTrajeto=" + distanciaUltimoTrajeto +
                ", distanciaTotal=" + distanciaTotal +
                '}' + '\n';
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Veiculo other = (Veiculo) obj;
        return this.getMatricula().equals(other.getMatricula()) && this.getMarca().equals(other.getMarca()) && this.getModelo().equals(other.getModelo()) && this.getPotencia() == other.getPotencia();
    }
    
}
