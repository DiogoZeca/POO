package aula07.ex1;

public class Retangulo extends Forma {
 
    private double largura;
    private double comprimento;

    private boolean validateLargura(double largura) {
        if (largura < 0) throw new IllegalArgumentException("Largura não pode ser negativa! ");
        return true;
    }

    private boolean validateComprimento(double comprimento) {
        if (comprimento < 0) throw new IllegalArgumentException("Comprimento não pode ser negativo! ");
        return true;
    }

    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        if (validateLargura(largura)) this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        if (validateComprimento(comprimento)) this.comprimento = comprimento;
    }

    public Retangulo(double largura, double comprimento) {
        if (validateLargura(largura) && validateComprimento(comprimento)) {
            this.largura = largura;
            this.comprimento = comprimento;
        }
        this.setCor(cor);
    }

    public double getArea() {
        return largura * comprimento;
    }

    public double getPerimetro() {
        return 2 * (largura + comprimento);
    }


    @Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		Retangulo retangulo = (Retangulo) obj;
        return this.largura == retangulo.largura && this.comprimento == retangulo.comprimento && this.getCor() == retangulo.getCor();
	}

    @Override
    public String toString() {
        return "Retangulo com largura " + this.largura + " e comprimento " + this.comprimento + " e cor " + this.getCor();
    }

    public static Retangulo get(int indiceRetangulo) {
        return null;
    }



}
