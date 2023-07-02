package aula02;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double euros = util.getDouble("Introduza o montante em Euros para investir: ", sc);
        double taxa = util.getDouble("Introduza a taxa de juro mensal (%%): ", sc);
        double meses = 3;
        double jurosCompostos = euros * Math.pow((1 + taxa/100), meses);
        String jurosCompostosString = String.format("%.2f", jurosCompostos);
        System.out.println("O montante após " + meses + " meses é " + jurosCompostosString + " Euros");
        sc.close();
    }
}
