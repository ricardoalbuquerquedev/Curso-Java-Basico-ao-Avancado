package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("O pequeno príncipe");
        livros.push("Dom Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        for (String livro: livros){ // foreach
            System.out.println(livro);

        }
        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.pop());

        //livros.size(); --> tamanho
       // livros.clear();--> limpar
       // livros.contains(); --> contém
        // livros.isEmpty(); --> está vazio, se tiver é true se nao, eh false


    }
}






