package aula06.ex1;

import aula05.ex1.DateYMD;

public class Professor extends Pessoa {
    private String Categoria;
    private String Departamento;

    public Professor(String nome, int cc, DateYMD dataNasc, String Categoria, String Departamento) {
        super(nome, cc, dataNasc);
        this.Categoria = Categoria;
        this.Departamento = Departamento;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }
    
    @Override
    public String toString() {
        return "Professor [Categoria=" + Categoria + ", Departamento=" + Departamento + ", toString()=" + super.toString()+ "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Professor other = (Professor) obj;
        if (Categoria == null) {
            if (other.Categoria != null)
                return false;
        } else if (!Categoria.equals(other.Categoria))
            return false;
        if (Departamento != other.Departamento)
            return false;
        return true;
    }


}
