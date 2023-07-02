package aula10.ex01;

public class ex01 {
        public static void main(String[] args) {
                GenreBooks genreBooks = new GenreBooks();
        
                genreBooks.adicionarLivro("Drama", new Book("Livro 1", "Autor 1", 2021));
                genreBooks.adicionarLivro("Drama", new Book("Livro 2", "Autor 2", 2022));
                genreBooks.adicionarLivro("Fantasia", new Book("Livro 3", "Autor 3", 2023));
                genreBooks.adicionarLivro("Fantasia", new Book("Livro 4", "Autor 4", 2024));
        
                System.out.println(genreBooks);
        }

}
