package aula03extra;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner jose = new Scanner(System.in);
        System.out.print("Introduza uma String: ");
        String alberta = jose.nextLine();
        System.out.println(alberta.toLowerCase());
        System.out.println("last char = " + alberta.charAt(alberta.length() - 1));
        System.out.println("Three first chars = " + alberta.substring(0, 3));

        jose.close();
    }    
}
