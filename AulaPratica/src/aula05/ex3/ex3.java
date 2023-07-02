package aula05.ex3;

import aula05.ex1.DateYMD;

public class ex3 {
    
    public static void main(String[] args) {
        agencia imobiliaria = new agencia();
        imobiliaria.novaPropriedade("Glória", 2, 30000);
        imobiliaria.novaPropriedade("Vera Cruz", 1, 25000);
        imobiliaria.novaPropriedade("Santa Joana", 3, 32000);
        imobiliaria.novaPropriedade("Aradas", 2, 24000);
        imobiliaria.novaPropriedade("São Bernardo", 2, 20000);

        imobiliaria.venda(1001);
        imobiliaria.leilao(1002, new DateYMD(21, 3, 2023), 4);
        imobiliaria.leilao(1003, new DateYMD(1, 4, 2023), 3);
        imobiliaria.leilao(1001, new DateYMD(1, 4, 2023), 4);
        imobiliaria.leilao(1010, new DateYMD(1, 4, 2023), 4);

        System.out.println(imobiliaria);
    }
}
