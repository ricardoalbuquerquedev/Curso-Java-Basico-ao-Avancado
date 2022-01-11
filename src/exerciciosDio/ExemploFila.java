package exerciciosDio;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Pamela");
        filaBanco.add("Paty");
        filaBanco.add("Bob");
        filaBanco.add("Fábia");
        filaBanco.add("Armando");
        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);
        //filaBanco.clear();
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for(String client:filaBanco){
            System.out.println(client);

            Iterator <String> iteratorFilaBanco = filaBanco.iterator();
            while(iteratorFilaBanco.hasNext()){
                System.out.println("....>"+ iteratorFilaBanco.next());
            }
            System.out.println(filaBanco.size());
            System.out.println(filaBanco.isEmpty());
            
        }

    }
}
