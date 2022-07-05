package oo.revisao.Secao6.Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilhah {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();     // PILHA É LIFO

        livros.add("Pássaro contra vidraça");  // o add retorna valor boleano
        livros.push("Comece pelo porquê"); // o push não faz nada, ele retorna uma excecao
        livros.push("O mundo de Sofia");


        System.out.println(livros.peek()); // peek e element obtem o primeiro elemento da fila sem remover.
        System.out.println(livros.element()); // como em pilha eh LIFO então o primeiro é o ultimo colocado.
        System.out.println();    // só para separar no console.

        for (String livro : livros) {    // percorrer a pilha de livros com foreach
            System.out.println(livros);
        }

            System.out.println(livros.poll());
            System.out.println(">>>>" + livros.pop());  // pop tb exclui da pilha , assim como remove joga uma excecao se
            // n tiver elemento dentro da pilha.
            System.out.println(livros.poll());
            System.out.println(livros.poll()); // quando a pilha está vazia o poll retorna null.
            System.out.println(livros.remove()); // o remove joga uma excecao caso a pilha esteja vazia.

            // métodos tb disponíveis:
//        livros.size();
//        livros.contains("...");
//        livros.clear();
            //livros.isEmpty();


        }
    }


