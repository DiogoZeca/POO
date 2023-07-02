package AvAula07;

public class DVD extends LibraryItem {
    private int duration;

    public DVD(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "[DVD: " + super.toString() + ", duration=" + duration + "]";
    }

    
}
    
