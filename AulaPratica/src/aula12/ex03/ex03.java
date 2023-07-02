package aula12.ex03;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ex03 {
    public static void main(String[] args) throws Exception{
        ArrayList<Movie> movies = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader("AulaPRatica\\src\\aula12\\ex03\\movies.txt"));
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(";");
            movies.add(new Movie(line[0], Float.parseFloat(line[1]), line[2], line[3], Integer.parseInt(line[4])));
        }
        sc.close();
        
        movies.sort((Movie m1, Movie m2) -> m1.getTitle().compareTo(m2.getTitle()));
        System.out.println("Ordem alfabética");
        System.out.println(movies);

        movies.sort((Movie m1, Movie m2) -> m1.getScore() > m2.getScore() ? -1 : 1);
        System.out.println("Ordem decrescente de score");
        System.out.println(movies);

        movies.sort((movie1,movie2) -> movie1.getRuntime() - movie2.getRuntime()> 0 ? 1 : -1);
        System.out.println("Ordem crescente de runtime");
        System.out.println(movies);


        Map<String, Integer> genre = new TreeMap<String, Integer>();

        for(Movie m : movies){
            if(genre.containsKey(m.getGenre())){
                genre.put(m.getGenre(), genre.get(m.getGenre()) + 1);
            }else{
                genre.put(m.getGenre(), 1);
            }
        }
        System.out.println("Quantidade de filmes por género");
        System.out.println(genre);
    }
}
