package POO2122Recurso;

public class RoteiroHistorico extends Servico {

    private String nome;
    private String local;

    public RoteiroHistorico(String nome, String local) {
        super("R");
        this.nome = nome;
        this.local = local;
    }
    
    @Override
    public String toString() {
        return "RoteiroHistorico{" + "nome='" + nome + '\'' + ", local='" + local + '\'' + '}';
    }

}
