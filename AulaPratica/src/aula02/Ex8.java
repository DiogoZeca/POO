package aula02;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double catetoA = util.getDouble("Insira o valor do cateto A:", sc);
        double catetoB = util.getDouble("Insira o valor do cateto B:", sc);
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        String hipotenusaString = String.format("%.2f", hipotenusa);
        System.out.println("O valor da hipotenusa é " + hipotenusaString);
        sc.close();
    }

}
