package oo.revisao.Secao6.Colecoes;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoCcomportado {
    public static void main(String[] args) {
        //Set<String> listaAprovados = new HashSet<>(); // o Set NÃO mantem ordem de inserção
        Set<String> listaAprovados = new TreeSet<>(); // o TreeSet  garante ordem de inserção,
        // ele faz parte do SortedSet que são conjuntos ordenados.
        listaAprovados.add("Anne");
        listaAprovados.add("Perla");
        listaAprovados.add("Rita");
        listaAprovados.add("Marcos");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }
        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(15);
        nums.add(36);

        for (int n:nums){
            System.out.println(n);
        }
    }
}