package aula11.ex01;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class ReadFile {
    public static Map<String, Map<String, Integer>> readFile(String path) throws IOException {
        Scanner input = new Scanner(new FileReader(path, StandardCharsets.UTF_8));
        Map<String, Map<String, Integer>> mapa = new HashMap<>();
        String wordAnterior = null;

        input.useDelimiter("[\\t\\n\\r\\s.,:'‘’;?!-*{}=+&/()\\[\\]”“\"\\' ]+");


        while (input.hasNext()) {
            String word = input.next();
            if (word.length() <= 3)
                continue;
                
            word = word.replaceAll("\\t\\n\\.,:'‘’;?!-\\*\\{\\}=\\+&/\\(\\)\\[\\]”“\"\'", "");

            if (wordAnterior == null) {
                wordAnterior = word;
                continue;
            }

            mapa.putIfAbsent(wordAnterior, new HashMap<String, Integer>());
            mapa.get(wordAnterior).putIfAbsent(word, 0);
            mapa.get(wordAnterior).put(word, mapa.get(wordAnterior).get(word) + 1);
            wordAnterior = word;
        }
        input.close();
        return mapa;
    }
}
