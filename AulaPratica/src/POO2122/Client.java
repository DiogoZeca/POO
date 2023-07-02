package POO2122;

public class Client {
    
    private String nome;
    private String localidade;

    public Client(String nome, String localidade) {
        this.nome = nome;
        this.localidade = localidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;

        Client other = (Client) obj;
        return this.getNome().equals(other.getNome()) && this.getLocalidade().equals(other.getLocalidade());
    }

    @Override
    public String toString() {
        return String.format("%s [%s]", this.getNome(), this.getLocalidade());
    }
}
