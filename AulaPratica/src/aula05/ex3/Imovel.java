package aula05.ex3;

import aula05.ex1.DateYMD;

public class Imovel {
    int identificador, quartos;
    double preço;
    boolean disponiblidade;
    DateYMD datai, dataf;
    String localidade;


    public Imovel(int identificador, double preço, String localidade, int quartos) {
        this.identificador = identificador;
        this.preço = preço;
        this.localidade = localidade;
        this.disponiblidade = true;
        this.datai = null;
        this.dataf = null;
        this.quartos = quartos;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public boolean isDisponiblidade() {
        return disponiblidade;
    }

    public void setDisponiblidade(boolean disponiblidade) {
        this.disponiblidade = disponiblidade;
    }

    public DateYMD getDatai() {
        return datai;
    }

    public void setDatai(DateYMD datai) {
        this.datai = datai;
    }

    public DateYMD getDataf() {
        return dataf;
    }

    public void setDataf(DateYMD dataf) {
        this.dataf = dataf;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        String returnString = "Imóvel: " + this.getIdentificador() + "; quartos: " + this.getQuartos()
                              + "; localidade: " + this.getLocalidade() + "; preço: " + this.getPreço()
                              + "; disponível: " + ( this.isDisponiblidade() ? "sim" : "não" );

        if (this.getDatai() != null && this.getDataf() != null) {
            returnString += "; leilão " + this.getDatai() + " : " + this.getDataf();
        }

        return returnString;
    }
}
