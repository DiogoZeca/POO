package aula12;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("AulaPratica/src/aula12/A_cidade_e_as_serras.txt", StandardCharsets.UTF_8));
        TreeMap<String, HashMap<String, Integer>> map = new TreeMap<>();
        sc.useDelimiter("[\\t\\n\\.,:'‘’;?!-\\*\\{\\}=\\+&/\\(\\)\\[\\]”“\"\' ]+");
        while(sc.hasNext()){
            String word = sc.next();
            String firstLetter = word.substring(0,1);
            if(!map.containsKey(firstLetter)){
                map.put(firstLetter, new HashMap<>());
            }
            if(!map.get(firstLetter).containsKey(word)){
                map.get(firstLetter).put(word, 0);
            }
            int soma = map.get(firstLetter).get(word) + 1;
            map.get(firstLetter).put(word, soma);
        } 
        for(String key : map.keySet()){
            System.out.print(key + ": ");
            for(String word : map.get(key).keySet()){
                System.out.print(word + ", " + map.get(key).get(word) + "; ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
