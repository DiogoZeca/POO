package aula07.ex1;

public abstract class Forma {

    public abstract double getArea();
    public abstract double getPerimetro();
    public String cor;

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Forma com cor " + this.cor;
    }

}
