package aula06.ex1;

import aula05.ex1.DateYMD;

public class Bolseiro extends Aluno{

    private int bolsa;
    private Professor atributo;

    public Bolseiro(String nome, int cc, DateYMD dataNasc, Professor atributo, int bolsa) {
        super(nome, cc, dataNasc);
        this.bolsa = bolsa;
        this.atributo = atributo;
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public Professor getOrientador() {
        return atributo;
    }

    public void setOrientador(Professor atributo) {
        this.atributo = atributo;
    }

    @Override
    public String toString() {
        return "Bolseiro [bolsa=" + bolsa + ", atributo=" + atributo + ", toString()=" + super.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bolseiro other = (Bolseiro) obj;
        if (atributo == null) {
            if (other.atributo != null)
                return false;
        } else if (!atributo.equals(other.atributo))
            return false;
        if (bolsa != other.bolsa)
            return false;
        return true;
    }
    
}
