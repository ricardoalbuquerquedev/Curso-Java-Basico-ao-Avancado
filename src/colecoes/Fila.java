package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue <String> fila = new LinkedList<>();

        // offer e add -> adc elementos na fila
        // A diferença é o comportamento qd a fila ta cheia
        fila.add("Ana"); //lança uma exceção
        fila.offer("Bia"); // retorna falso
        fila.add("Carlo");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        System.out.println(fila.peek());
        System.out.println(fila.peek());

        System.out.println(fila.element());
        System.out.println(fila.element());
        //peek e element - obtem o próximo elemento da fila sem remover

        //poll e remove - obtem o primeiro elemento da fila e remove
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        //fila.size() - contar o tamanho da fila
        //fila.clear() - limpar fila
        //fila.isEmpty() - para saber se a fila está ou não vazia
        //fila.contains(...)
    }
}
