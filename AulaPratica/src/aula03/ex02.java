package aula03;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double valorInvestido = util.getDouble("Introduza o valor de montante investido (múltiplo de  1000): ", sc);
        double taxaJuro = util.getDouble("Introduza a taxa de juro (%): ", sc) / 100;
        int duracao = 12;
        calculaJuros(valorInvestido, taxaJuro, duracao);
        sc.close();
    }

    public static void calculaJuros(Double valorInvestido, Double taxaJuro, int duracao) {
        int i;
        for (i = 0; i <= duracao; i++) {
            System.out.printf("Mês %d: %.2f \n", i, valorInvestido);
            Double juros = valorInvestido * taxaJuro;
            valorInvestido = valorInvestido + juros;
        }
    }
}
