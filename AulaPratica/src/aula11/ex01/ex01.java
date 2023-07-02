package aula11.ex01;

import java.io. IOException;
import java.util.ArrayList;
import java.util.Map;

public class ex01  {
    static ArrayList<String> palavras = new ArrayList<String>();
    public static void main(String[] args) throws IOException {
        Map<String, Map<String, Integer>> palavras = ReadFile.readFile("AulaPratica/src/aula11/ex01/frase.txt");
        
        for (String palavra : palavras.keySet()) {
            System.out.print(palavra + "=" + palavras.get(palavra) + "\n");
        }
    }
}
