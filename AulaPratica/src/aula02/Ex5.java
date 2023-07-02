package aula02;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v1 = util.getDouble("Introduza um valor para a velocidade V1: ", sc);
        double v2 = util.getDouble("Introduza um valor para a velocidade V2: ", sc);
        double d1 = util.getDouble("Introduza um valor para a distância D1: ", sc);
        double d2 = util.getDouble("Introduza um valor para a distância D2: ", sc);
        double tempoTotal = v1 * d1 + v2 * d2;
        double velocidadeMedia = tempoTotal / (d1 + d2);
        String velocidadeMediaString = String.format("%.2f", velocidadeMedia);
        System.out.println("A velocidade média é " + velocidadeMediaString );
        sc.close();
    }    

}
