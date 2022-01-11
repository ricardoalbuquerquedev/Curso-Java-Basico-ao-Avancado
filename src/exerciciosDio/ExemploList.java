package exerciciosDio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Rosa");  //0
        nomes.add("João");  //1
        nomes.add("Ana");  //2
        nomes.add("Perla");  //3
        nomes.add("July");  //4
        nomes.add ("Luan");  //5

        System.out.println(nomes);
        nomes.set(2,"Camila");   // Aqui eu substitui o nome do indice 2 por Camila, era Ana
        System.out.println(nomes);
        Collections.sort(nomes);  // ordem alfabética
        System.out.println(nomes);

        System.out.println(nomes.remove(1));
        System.out.println(nomes.remove("July"));
        System.out.println(nomes);

        String nome = nomes.get(3);
        System.out.println(nome);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        nomes.remove("Luan");
        System.out.println(nomes);
        tamanho = nomes.size();
        System.out.println(tamanho);
        for(String nomeDaLinha:nomes);

    }
}
