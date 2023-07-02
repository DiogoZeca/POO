package POO2122;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Event implements IEvent {
    
    private LocalDate date;
    private Set<Activity> atividades;

    public Event(LocalDate date) {
        this.date = date;
        this.atividades = new LinkedHashSet<>();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Set<Activity> getAtividades() {
        return atividades;
    }

    public Event addActivity(Activity activity) {
        if ((activity instanceof Catering) && this.hasCateringActivity()){
            return this;
        }
        this.atividades.add(activity);
        return this;
    }

    public boolean hasCateringActivity(){
        for (Activity a : this.atividades) {
            if (a instanceof Catering) {
                return true;
                }
        }
        return false;
    }
    
    public double totalPrice() {
        double total = 0.0;
        for (Activity a : this.atividades) {
            total += a.getPrice() * a.getParticipants();
        }
        return total;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Event event = (Event) obj;
        return this.getDate().equals(event.getDate()) && this.getAtividades().equals(event.getAtividades());
    }

    @Override
    public String toString() {
        String str = String.format("*** Evento em %s, total=%s euros", this.getDate(), this.totalPrice());
        for (Activity a : atividades) {
            str += "\n" + a;
        }
        return str;
    }
}
