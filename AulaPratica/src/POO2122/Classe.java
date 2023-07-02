package POO2122;

public enum Classe {
	TURISTICA("Turística"),
	EXECUTIVA("Executiva"),
	PRIMEIRA("Primeira");

	private Classe(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}
}