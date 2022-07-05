package oo.revisao.Secao6.Colecoes;

import java.util.ArrayList;

public class Listah {
    public static void main(String[] args) {

        ArrayList<Usuarioh> lista = new ArrayList<>();

        Usuarioh u1 = new Usuarioh("Ana");
        lista.add(u1);

        lista.add(new Usuarioh("Raquel"));
        lista.add(new Usuarioh("Rico"));
        lista.add(new Usuarioh("Stela"));
        lista.add(new Usuarioh("Olivia"));

        System.out.println(lista.get(4).nome); // aqui vc consegue acessar pelo ínidce!

        System.out.println(">>>>>>>"+lista.remove(3));// removi pelo índice entao retorna o objeto que eu excluí.

        System.out.println(lista.remove(new Usuarioh("Olivia")));// removi a partir do objeto Olívia,
        // sendo assim retorna true ou false

        System.out.println(lista.contains(new Usuarioh("Anita")));


        System.out.println((new Usuarioh("Stela")));

        for( Usuarioh u: lista){
            System.out.println(u);
        }
    }
}
