package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set<String>listaAprovados =new HashSet<>(); // a String junto ao Set é o tipo de dado que quero amarrar na lista
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlo");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro"); // temos dados homogeneos, tds tipo String

        for (String candidato:listaAprovados) {
            System.out.println(candidato); // por ser um Set não imprime na ordem
            
        }
    }
}
