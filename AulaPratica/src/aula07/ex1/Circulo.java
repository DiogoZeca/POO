package aula07.ex1;

public class Circulo extends Forma{
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio, String cor) {
        if(validarRaio(raio)) this.raio = raio;
        this.setCor(cor);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (validarRaio(raio)) this.raio = raio;
    }


    @Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Circulo Circulo = (Circulo) obj;
		return this.raio == Circulo.raio;
	}


    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }


    @Override
	public String toString() {
		return "Circulo com raio " + this.raio;
	}

   private boolean validarRaio(double raio) {
		if (raio < 0) throw new IllegalArgumentException("Raio não pode ser negativo! ");
		return true;
	}

    public static Circulo get(int indice) {
        return null;
    }
}
