package aula10.ex01;

import java.util.*;

public class GenreBooks {
    private Map<String, List<Book>> genreBooks;

    public GenreBooks() {
        genreBooks = new HashMap<>();
    }

    public void adicionarLivro(String genero, Book livro) {
        genreBooks.computeIfAbsent(genero, k -> new ArrayList<>()).add(livro);
    }

    public void alterarLivro(String genero, int indice, Book novoLivro) {
        List<Book> livros = genreBooks.get(genero);
        if (livros != null && indice >= 0 && indice < livros.size()) {
            livros.set(indice, novoLivro);
        } else {
            System.out.println("Gênero não encontrado ou índice inválido.");
        }
    }

    public void removerLivro(String genero, int indice) {
        List<Book> livros = genreBooks.get(genero);
        if (livros != null && indice >= 0 && indice < livros.size()) {
            livros.remove(indice);
        } else {
            System.out.println("Gênero não encontrado ou índice inválido.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<Book>> entry : genreBooks.entrySet()) {
            String genero = entry.getKey();
            List<Book> livros = entry.getValue();
            sb.append("Gênero: ").append(genero).append("\n");
            for (Book livro : livros) {
                sb.append(livro.toString()).append("\n");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public List<String> listarGeneros() {
        return new ArrayList<>(genreBooks.keySet());
    }

    public List<Book> listarLivros() {
        List<Book> livros = new ArrayList<>();
        for (List<Book> livroList : genreBooks.values()) {
            livros.addAll(livroList);
        }
        return livros;
    }
}
