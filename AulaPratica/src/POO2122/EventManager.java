package POO2122;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class EventManager {
    
    private String nome;
    private Map<Client, Set<Event>> MapaEventos;

    public EventManager(String nome) {
        this.nome = nome;
        this.MapaEventos = new LinkedHashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<Client, Set<Event>> getMapaEventos() {
        return this.MapaEventos;
    }

    public void setMapaEventos(Map<Client, Set<Event>> mapaEventos) {
        this.MapaEventos = mapaEventos;
    }

    public Client addClient(String name, String localidade) {
        Client cliente = new Client(name, localidade);
        for (Client c : MapaEventos.keySet()) {
            if (c.equals(c)) {
                return c;
            }
        }
        MapaEventos.put(cliente, new LinkedHashSet<>());
        return cliente;
    }


    public Event addEvent(Client client, LocalDate Date) {
        Event evento = new Event(Date);
        MapaEventos.get(client).add(evento);
        return evento;
    }

    public String listClients(){
        String str = "Clients:";
        for (Client c : MapaEventos.keySet()) {
            str += "\n" + c;
        }
        return str;
    }

    public String listEvents(){
        String str = "Events:";
        for (Client c : MapaEventos.keySet()) {
            str += "\n" + c;
            for (Event e : MapaEventos.get(c)) {
                str += "\n" + e;
            }
        }
        return str;
    }

    public List<String> clientsWithEvents(){
        ArrayList<String> lista = new ArrayList<>();
        for (Client c : MapaEventos.keySet()) {
            if (MapaEventos.get(c).size() > 0) {
                lista.add(c.toString());
            }
        }
        return lista;
    }

    public List<String> nextEventsByDate(){
        TreeSet<Event> lista = new TreeSet<>(Comparator.comparing(Event::getDate));
        for (Set<Event> e : MapaEventos.values()) {
            for(Event ev : e){
                lista.add(ev);
            }
        }
        ArrayList<String> lista2 = new ArrayList<>();
        lista.forEach( e -> lista2.add(e.toString()));
        return lista2;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
