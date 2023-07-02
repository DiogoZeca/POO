package aula02;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza um número em Quilómetros para converter em milhas: ");
        double km = sc.nextDouble();
        double milhas = km / 1.609;
        String milhasString = String.format("%.2f", milhas);
        System.out.println(km + " quilómetros são " + milhasString + " Milhas");
        sc.close();
    }
}
