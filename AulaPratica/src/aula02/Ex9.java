package aula02;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorPositivo = util.getInt("Introduza um valor Positivo: ", sc);
        for (int i = valorPositivo; i >= 0; i--) {
            if (i % 10 == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + ", ");
            }
        }
        sc.close();
    }
}
