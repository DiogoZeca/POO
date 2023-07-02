package aula06.ex2;


import aula06.ex1.Pessoa;

public class Contacto extends Pessoa{
    private int numero;
    private int ID;
    private String email;

    public Contacto(String name,int numero,int ID, String email){
        super(name);
        if(validnumber(numero) && validemail(email)){
            this.ID = ID;
            this.email = email;
            this.numero = numero;
        }
    }

    public Contacto(String name,int numero,int ID){
        super(name);
        if(validnumber(numero)){
            this.ID = ID;
            this.numero = numero;
        }
    }

    public Contacto(String name,int ID, String email){
        super(name);
        if(validemail(email)){
            this.ID = ID;
            this.email = email;
        }
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private boolean validnumber(int numero) {
        if(numero < 90000000 || numero > 999999999) throw new IllegalArgumentException("Numero invalido");
        return true;
    }

    private boolean validemail(String email) {
        String regex = "^(.+)@(.+)$";
        if(!email.matches(regex)) throw new IllegalArgumentException("Email invalido");
        return true;
    }

    @Override
    public String toString(){
        String toReturn = "{" + "Nome: " + getNome() + ", ID: " + getID() + "'";
        if(getNumero() != 0) toReturn += ", Numero: " + getNumero();
        if(getEmail() != null) toReturn += ", Email: " + getEmail();
        toReturn += "}";
        return toReturn;
    }
}
