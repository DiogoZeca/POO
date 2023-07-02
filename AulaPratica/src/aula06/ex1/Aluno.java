package aula06.ex1;

import aula05.ex1.DateYMD;
import java.time.LocalDate;

public class Aluno extends Pessoa{
    private int nMec = 100;
    private DateYMD DataInscr;

    public Aluno(String nome, int cc, DateYMD dataNasc, DateYMD DataInscr) {
        super(nome, cc, dataNasc);
        nMec += 1;
        this.DataInscr = DataInscr;
    }
    
    public Aluno(String nome, int cc, DateYMD dataNasc) {
        super(nome, cc, dataNasc);
        nMec += 1;
        this.DataInscr = new DateYMD(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
    }

    public int NumeroMecanografico(int nMec){
        return nMec;
    }

    public int getnMec() {
        return nMec;
    }

    public void setnMec(int nMec) {
        this.nMec = nMec;
    }

    public DateYMD getDataInscr() {
        return DataInscr;
    }

    public void setDataInscr(DateYMD dataInscr) {
        DataInscr = dataInscr;
    }

    @Override
    public String toString() {
        return "Aluno [DataInscr=" + DataInscr + ", nMec=" + nMec + ", toString()=" + super.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (DataInscr == null) {
            if (other.DataInscr != null)
                return false;
        } else if (!DataInscr.equals(other.DataInscr))
            return false;
        if (nMec != other.nMec)
            return false;
        return true;
    }
}
