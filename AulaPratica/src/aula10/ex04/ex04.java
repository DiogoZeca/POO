package aula10.ex04;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.LinkedList;

public class ex04 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("words.txt"));
        LinkedList<String> Twocar = new LinkedList<>();
        while (input.hasNext()) {
            String word = input.next();
            
            if (!word.matches("[a-zA-Z]+")) {
                continue;
            }

            if (word.length() > 2) {
                Twocar.add(word);
            }
            
            if (word.endsWith("s")) {
                System.out.println(word);
            }
        }
        System.out.println(Twocar);
        input.close();
    }
}
