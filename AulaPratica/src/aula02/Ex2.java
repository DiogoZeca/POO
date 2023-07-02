package aula02;
import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = util.getDouble("Introduza a temperatura em Graus Celsius: ", sc);
        double fahrenheit = 1.8*celsius + 32;
        System.out.println(celsius + " Graus Celsius são " + fahrenheit + " Graus Fahrenheit");
        sc.close();
    }
}
