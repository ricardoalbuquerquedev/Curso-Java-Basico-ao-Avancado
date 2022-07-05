package voltandoAoComeco.Secao6.Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapah {

    public static void main(String[] args) {
        // Map -> Estrutura chave valor! >>  put significa colocar

        Map<Integer, String> usuarios = new HashMap<>();  // p/ adc no map eu uso o put! Ele adc e substitui caso exista

        usuarios.put(1, "Bob");
        usuarios.put(2, "Rosa");
        usuarios.put(3, "Tati");
        usuarios.put(4, "Bia");

        System.out.println(usuarios.size());  // tamanho
        System.out.println(usuarios.isEmpty());  // retorna true or false

        System.out.println(usuarios.keySet()); // imprimindo o numero de chaves
        System.out.println(usuarios.values());  // imprimindo os valores
        System.out.println(usuarios.entrySet()); // imprimindo chave e valor

        System.out.println(usuarios.containsKey(2)); // imprime se contem a chave 2, resulta  true or false
        System.out.println(usuarios.containsKey(10));  // resulta true or false
        System.out.println(usuarios.containsValue("Tati"));  //  imprime o valor>>> resulta true or false
        System.out.println(usuarios.get(3));  // imprime o valor pego  pela chave , get >> pegar

        // atraves do for each vamos percorrer o map atraves da chave, do valor ou dos 2 ao msm tmp.

        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }
            for (String valor : usuarios.values()) {  // values aqui é um método, NAO um atributo
                System.out.println(valor);
            }
            for(Map.Entry <Integer,String> registro: usuarios.entrySet()){
                System.out.print(registro.getKey()+">>>");
                System.out.println(registro.getValue());
        }

        }

        }



