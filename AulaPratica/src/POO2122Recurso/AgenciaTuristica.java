package POO2122Recurso;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.Comparator;

public class AgenciaTuristica {

    private String nome;
    private String morada;
    private Set<PacoteTuristico> listaPacotes = new HashSet<>() ;
    private List<Reserva> reservas = new ArrayList<>();

    public AgenciaTuristica(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public PacoteTuristico pacoteTuristico(String nome, int numeroDeNoites, int precoPorNoite) {
        for (PacoteTuristico pacoteTuristico : listaPacotes) {
            if (pacoteTuristico.getNome().equals(nome)) {
                return null;
            }
        }
        PacoteTuristico pacoteTuristico = new PacoteTuristico(nome, numeroDeNoites, precoPorNoite);
        listaPacotes.add(pacoteTuristico);
        return pacoteTuristico;
    }

    public PacoteTuristico getPacoteTuristico(String nome) {
        for (PacoteTuristico pacoteTuristico : listaPacotes) {
            if (pacoteTuristico.getNome().equals(nome)) {
                return pacoteTuristico;
            }
        }
        return null;
    }

    public Reserva reserva(PacoteTuristico pacoteTuristico, int numPessoas ) {
		if (!listaPacotes.contains(pacoteTuristico)) {
			System.out.println("%% O Pacote Turístico indicado não existe. Reserva não efetuada!");
			return null;
		}

		Reserva reserva = new Reserva(pacoteTuristico, numPessoas );
		reservas.add(reserva);
		return reserva;
	}

    public ArrayList<PacoteTuristico> listaPacotes() {
        ArrayList<PacoteTuristico> pacotes = new ArrayList<>();

        for (PacoteTuristico pacoteTuristico : listaPacotes) {
            pacotes.add(pacoteTuristico);
        }
        return pacotes;
    }

    public String listaReservas(){
        String lista = "";

        for (Reserva reserva : reservas) {
            lista += reserva.toString() + "\n";
        }
        return lista;
    }

    public ArrayList<PacoteTuristico> pacotesPorPreco(int precoTotal) {
        ArrayList<PacoteTuristico> pacotes = new ArrayList<>();

        for (PacoteTuristico pacoteTuristico : listaPacotes) {
            if (pacoteTuristico.getPrecoTotal() > precoTotal) {
                pacotes.add(pacoteTuristico);
            }
        }
        return pacotes;
    }

    public ArrayList<Reserva> reservasPorPreco() {
		ArrayList<Reserva> result = new ArrayList<>();
		for (Reserva r : reservas) {
			result.add(r);
		}

		Collections.sort(result, new Comparator<Reserva>() {
			@Override
			public int compare(Reserva r1, Reserva r2) {
				return (int) (r1.getPrecoTotal() - r2.getPrecoTotal());
			}
		});

		return result;
	}

    @Override
    public boolean equals(Object o) {
        if (o instanceof AgenciaTuristica) {
            AgenciaTuristica agenciaTuristica = (AgenciaTuristica) o;
            return this.nome.equals(agenciaTuristica.getNome()) && this.morada.equals(agenciaTuristica.getMorada());
        }
        return false;
    }

    @Override
    public String toString() {
        return "AgenciaTuristica{" +
                "nome='" + nome + '\'' +
                ", morada='" + morada + '\'' +
                ", listaPacotes=" + listaPacotes +
                ", reservas=" + reservas +
                '}';
    }
}
