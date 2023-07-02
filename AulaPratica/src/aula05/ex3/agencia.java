package aula05.ex3;

import java.util.*;
import aula05.ex1.DateYMD;


public class agencia {
    private static int nextID = 1000;
    ArrayList<Imovel> propriedades = new ArrayList<Imovel>();

    public Imovel novaPropriedade(String localidade, int quartos, double preço){
        Imovel imovel = new Imovel(nextID, preço, localidade, quartos);
        nextID++;
        propriedades.add(imovel);
        return imovel;
    }

    public void venda(int numero){
        if (numero < nextID){
            for(int i = 0; i < propriedades.size(); i++){
                Imovel imovel = propriedades.get(i);
                int identificador = imovel.getIdentificador();
                if (numero == identificador){
                    if (imovel.isDisponiblidade() == true){
                        System.out.println("Imóvel " + numero + " vendido");
                        imovel.setDisponiblidade(false);
                        return;
                    }
                    else{
                        System.out.println("Imóvel " + numero + " não está disponível");
                        return;
                    }
                }
            }
        }
        System.out.println("Imóvel " + numero + " não existe");
    }

    public void leilao(int numero, DateYMD datai, int incremento) {
        if (numero < nextID){
            for(int i = 0; i < propriedades.size(); i++){
                Imovel imovel = propriedades.get(i);
                int identificador = imovel.getIdentificador();
                if (numero == identificador){
                    imovel.setDatai(datai);
                    datai.increment();
                    imovel.setDataf(datai);
                }
            }
        }
    }
    @Override
    public String toString() {
        String returnString = "Propriedades:\n";
        for (Imovel i : propriedades) {
            returnString += i + "\n";
        }
        return returnString;
    }

}
