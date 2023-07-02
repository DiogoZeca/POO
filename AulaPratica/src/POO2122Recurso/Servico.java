package POO2122Recurso;

public class Servico {

    private String id;
    public static int numServicos = 100;

	public Servico(String service) {
		this.id = service + numServicos++;
	}

	public String getIdentifier() {
		return id;
	}
}
