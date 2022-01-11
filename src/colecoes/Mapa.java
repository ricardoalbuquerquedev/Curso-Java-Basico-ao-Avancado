package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer,String> usuarios = new HashMap<>();
        usuarios.put(1,"Roberto");
        usuarios.put(2,"Ricardo");
        usuarios.put(3,"Rafaela");
        usuarios.put(4,"Rebecca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());


        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Rebecca"));

        System.out.println(usuarios.get(3));

        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        for (String valor: usuarios.values()){ // nesse caso values é um método e n atributo
            System.out.println(valor);
        }
        for (Map.Entry<Integer,String> registo: usuarios.entrySet()){
            System.out.print(registo.getKey()+ " ");
            System.out.println(registo.getValue());


        }

    }
}
