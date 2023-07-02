package aula03extra;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner SACANA = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String str = SACANA.nextLine();
        SACANA.close();

        //////////////////Put just one space between words/////////////////////
        String after = str.trim().replaceAll(" +", " ");
        System.out.println(after);
        //////////////////////////////////////////////////////////////////////

        
        ///////////check if string is palindrome////////////////////
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println("A frase é um palíndromo.");
        } else {
            System.out.println("A frase não é um palíndromo.");
        }
        /////////////////////////////////////////////////////////////


        ////////////Check number of numbers in string////////////////
        int numbers = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                numbers++;
        }
        System.out.println("A frase contem " + numbers + " numeros.");
        /////////////////////////////////////////////////////////////



        ///////////Check number of spaces in string/////////////////
        int space = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') 
                space++;
        }
        System.out.println("A frase contem " + space + " espaços.");
        ////////////////////////////////////////////////////////////



        /////////Check if string is all lowercase/////////////////
        int sla = 0;
        for (int i = 0; i < str.length(); i++){
            if (Character.isLowerCase(str.charAt(i))) {
                sla ++;
            }
        }
        if ( sla == str.length()) {
            System.out.println("A frase é toda minuscula.");
        } else {
            System.out.println("A frase não é toda minuscula.");
        }
        ////////////////////////////////////////////////////////////
        
        

    }
}
