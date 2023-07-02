package POO2122Recurso;

import java.time.LocalDate;

public class Voo extends Servico {
    private String code;
    private LocalDate data;
    private Classe classe;

    public Voo( String code, LocalDate data, Classe classe){
        super("Voo");
        this.code = code;
        this.data = data;
        this.classe = classe;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code != null) {
            this.code = code;
        }
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if (data != null) {
            this.data = data;
        }
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        if (classe instanceof Classe) {
            this.classe = classe;
        }
    }

   
    @Override
    public boolean equals(Object o) {
        if (o instanceof Voo) {
            Voo v = (Voo) o;
            return this.code == v.getCode() && this.data.equals(v.getData()) && this.classe.equals(v.getClasse());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Voo{" + "code=" + code + ", data=" + data + ", classe=" + classe + '}';
    }

    
}
