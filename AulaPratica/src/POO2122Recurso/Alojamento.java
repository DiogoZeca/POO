package POO2122Recurso;

public class Alojamento extends Servico {

    private String nome;
    private int numeroDeQuartos;
    private int ocupacaoMaxima;

    private Regime regime;

    public Alojamento( String nome, int numeroDeQuartos, int ocupacaoMaxima, Regime regime) {
        super("ALOJ");
        this.nome = nome;
        this.numeroDeQuartos = numeroDeQuartos;
        this.ocupacaoMaxima = ocupacaoMaxima;
        this.regime = regime;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }
    public int getNumeroDeQuartos() {
        return numeroDeQuartos;
    }
    public void setNumeroDeQuartos(int numeroDeQuartos) {
        if (numeroDeQuartos > 0) {
            this.numeroDeQuartos = numeroDeQuartos;
        }
    }
    public int getOcupacaoMaxima() {
        return ocupacaoMaxima;
    }
    public void setOcupacaoMaxima(int ocupacaoMaxima) {
        if (ocupacaoMaxima > 0) {
            this.ocupacaoMaxima = ocupacaoMaxima;
        }
    }

    public Regime getRegime() {
        return regime;
    }

    public void setRegime(Regime regime) {
        if (regime instanceof Regime) {
            this.regime = regime;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Alojamento) {
            Alojamento a = (Alojamento) o;
            return this.nome.equals(a.getNome()) && this.numeroDeQuartos == a.getNumeroDeQuartos() && this.ocupacaoMaxima == a.getOcupacaoMaxima() && this.regime.equals(a.getRegime());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Alojamento{" + "nome='" + nome + '\'' + ", numeroDeQuartos=" + numeroDeQuartos + ", ocupacaoMaxima=" + ocupacaoMaxima + ", regime=" + regime +'}';
    }
    

}
