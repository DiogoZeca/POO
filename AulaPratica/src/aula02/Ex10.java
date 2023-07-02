package aula02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double primeiro = util.getDouble("Introduza um valor:", sc);
        double maximo = primeiro;
        double minimo = primeiro;
        double soma = primeiro;
        int count = 1;

        while (true){
            double numero = util.getDouble("Introduza um valor:", sc);
            if (numero == primeiro)
                break;
            soma += numero;
            count++;
            if (numero > maximo)
                maximo = numero;
            if (numero < minimo)
                minimo = numero;
        }
        System.out.println("O valor máximo é " + maximo);
        System.out.println("O valor minimo é " + minimo);
        System.out.println("A média dos valores é " + soma/count);
        System.out.println("Foram lidos " + count + " valores.");
        sc.close();

    }
}
