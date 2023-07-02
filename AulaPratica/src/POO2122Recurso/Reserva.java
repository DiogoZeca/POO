package POO2122Recurso;

public class Reserva {

    private int numPessoas;
    private PacoteTuristico pacoteTuristico;
    private double precoTotal;

    public Reserva(PacoteTuristico pacoteTuristico, int numPessoas) {
        this.numPessoas = numPessoas;
        this.pacoteTuristico = pacoteTuristico;
        this.precoTotal = pacoteTuristico.precoTotal(numPessoas);

        if(this.precoTotal > 12000){
            this.precoTotal = this.precoTotal * 0.07;
        }
    }

    public int getPrecoTotal() {
        return (int)precoTotal;
    }

    @Override
    public String toString() {
        return "Reserva{" + "numPessoas=" + numPessoas + ", pacoteTuristico=" + pacoteTuristico + ", precoTotal=" + precoTotal + '}';
    }
    
}
