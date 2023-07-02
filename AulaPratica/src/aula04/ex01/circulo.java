package aula04.ex01;

public class circulo {
    
    private double raio;

    private boolean validateRadius(double raio) {
		if (raio < 0) throw new IllegalArgumentException("Raio não pode ser negativo! ");
		return true;
	}

    public circulo(double raio) {
        if (validateRadius(raio)) this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (validateRadius(raio)) this.raio = raio;
    }


    @Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		circulo Circulo = (circulo) obj;
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

}
