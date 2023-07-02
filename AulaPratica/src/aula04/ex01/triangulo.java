package aula04.ex01;

public class triangulo {

    private double base;
    private double altura;

    public triangulo(double base, double altura) {
        if (validateBase(base) && validateAltura(altura) && validateTriangle(base, altura))
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (validateBase(base))
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (validateAltura(altura))
        this.altura = altura;
    }

    public double getArea() {
        return (base * altura) / 2;
    }

    public double getPerimetro() {
        return base + altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    @Override
    public String toString() {
        return "Triangulo com base " + this.base + " e altura " + this.altura;
    }


    private boolean validateBase(double base) {
        if (base < 0) throw new IllegalArgumentException("Base não pode ser negativa! ");
        return true;
    }

    private boolean validateAltura(double altura) {
        if (altura < 0) throw new IllegalArgumentException("Altura não pode ser negativa! ");
        return true;
    }

    private boolean validateTriangle(double base, double altura) {
        if (base < altura) throw new IllegalArgumentException("Base não pode ser menor que altura! ");
        return true;
    }


    @Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		triangulo Triangulo = (triangulo) obj;
		return this.base == Triangulo.base && this.altura == Triangulo.altura;
	}
    

}
