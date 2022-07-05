package voltandoAoComeco.Secao6.Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Filah {
    public static void main(String[] args) {
        Queue <String> fila = new LinkedList<>(); // Linkedlist é uma fila que acc todos os métodos de fila
        // então essa construção é válida! Essa minha fila é do tipo String

        // algumas funções em fila pode confundir, pois faz o mesmo papel mas em diferentes cenários.
        //offer e add -> Adicionam elementos na fila.
        // Diferença é o comportamento quando a fila está cheia

        fila.add("Ana");   // lança um problema, uma exceção se a fila tiver cheia.
        fila.offer("Paula"); // retorna false quando a fila está cheia.
        fila.add("Joana");
        fila.offer("Raquel");
        fila.add("Bia");
        fila.offer("Gui");
        // OUTRO método importante é pegar elemento da fila:

        System.out.println(fila.peek()); // peek e element  obtém o próximo elemento da fila sem remover
        System.out.println(fila.peek());  // quando a fila ta vazia-> retorna null
        System.out.println(fila.element());
        System.out.println(fila.element()); // quando a fila ta vazia ->retorna uma excecao
        // o peek e o element agem de forma diferente em fila vazia, o peek retorna null e o element retorna uma excecao

        // Poll e Remove obtem o elemento da fila já removendo.

        System.out.println(fila.poll());
        System.out.println(">>>>"+ fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());  //  O poll quando já n tem nada na fila ele retorna null!
        System.out.println(fila.remove()); // O remove quando já n tem o que remover na fila retorna erro
        // ( no such element exception)

        // Outros Métodos:
//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains();
       // fila.addAll();




    }
}
