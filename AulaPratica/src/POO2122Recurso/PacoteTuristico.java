package POO2122Recurso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PacoteTuristico implements IPacoteTuristico {

    private String nome;
    private int numeroDeNoites;
    private int precoPorNoite;
    private List<Servico> servicos = new ArrayList<Servico>();

    public PacoteTuristico(String nome, int numeroDeNoites, int precoPorNoite) {
        this.nome = nome;
        this.numeroDeNoites = numeroDeNoites;
        this.precoPorNoite = precoPorNoite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeNoites() {
        return numeroDeNoites;
    }

    public void setNumeroDeNoites(int numeroDeNoites) {
        this.numeroDeNoites = numeroDeNoites;
    }

    public int getPrecoPorNoite() {
        return precoPorNoite;
    }

    public void setPrecoPorNoite(int precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    public int precoTotal(int numPessoas) {
        return (int) (this.numeroDeNoites * this.precoPorNoite * numPessoas);
    }

    public int getPrecoTotal() {
        return this.numeroDeNoites * this.precoPorNoite;
    }



    public PacoteTuristico adicionaServico(Servico servico) {
        if (servico instanceof Voo) {
            for (Servico s : servicos) {
                if (s instanceof Voo) {
                    return this;
                }
            }
        } else if (servico instanceof Alojamento) {
            for (Servico s : servicos) {
                if (s instanceof Alojamento) {
                    return this;
                }
            }
        } else {
            boolean servicoJaAdicionado = false;
            for (Servico s : servicos) {
                if (s.getClass().equals(servico.getClass())) {
                    servicoJaAdicionado = true;
                    break;
                }
            }
            if (servicoJaAdicionado) {
                return this;
            }
        }
        servicos.add(servico);
        return this;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PacoteTuristico) {
            PacoteTuristico pacote = (PacoteTuristico) obj;
            return this.nome.equals(pacote.nome) && this.numeroDeNoites == pacote.numeroDeNoites
                    && this.precoPorNoite == pacote.precoPorNoite;
        }
        return false;
    }

    @Override
    public String toString() {
        return "PacoteTuristico{" + "nome='" + nome + '\'' + ", numeroDeNoites=" + numeroDeNoites + ", precoPorNoite="
                + precoPorNoite + ", servicos=" + servicos + '}';
    }

    @Override
    public Collection<String> listaServicos() {
        List<String> lista = new ArrayList<>();
        for (Servico servico : servicos) {
            lista.add(servico.toString());
        }
        return lista;   
    }

}
