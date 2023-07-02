package aula10.ex03;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza uma frase:");
        String frase = sc.nextLine();
        Map<Character, Integer> caracteres = new HashMap<Character, Integer>();
        sc.close();

        for (int i = 0; i < frase.length(); i++) {
            if (caracteres.containsKey(frase.charAt(i))) {
                caracteres.put(frase.charAt(i), caracteres.get(frase.charAt(i)) + 1);
            } else {
                caracteres.put(frase.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : caracteres.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        

    }

    
}
