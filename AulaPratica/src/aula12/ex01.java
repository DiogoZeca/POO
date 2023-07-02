package aula12;

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.nio.charset.StandardCharsets;

public class ex01 {
    
    public static HashSet<String> readFile(String path) throws IOException {
        HashSet<String> set = new HashSet<>();
        Scanner input = new Scanner(new FileReader(path, StandardCharsets.UTF_8));
        input.useDelimiter("[\\t\\n\\.,:'‘’;?!-\\*\\{\\}=\\+&/\\(\\)\\[\\]”“\"\' ]+");
        int count = 0;
        while (input.hasNext()) {
            String word = input.next();
            if (!set.contains(word)) {
                set.add(word);
            }
            count++;
        }
        System.out.println("Number of words: " + count);
        input.close();
        return set;
    }

    public static void main(String[] args) throws IOException {
        HashSet<String> set = readFile("AulaPratica/src/aula12/A_cidade_e_as_serras.txt");
        System.out.println("Number of distinct words: " + set.size());
    }
}
