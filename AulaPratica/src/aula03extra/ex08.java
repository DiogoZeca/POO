package aula03extra;

import java.util.*;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String str = sc.nextLine();
        sc.close();

        String[] words = str.split(" ");
        String acronim = "";
        for (String word : words) {
            if(word.length() > 3){
                    acronim += word.charAt(0);
            }
        }
        System.out.println("Acrônimo: " + acronim);
    }
}
