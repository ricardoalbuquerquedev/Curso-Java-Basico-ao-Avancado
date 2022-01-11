package oo.composição.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("caneta", 1, 100 );
        compra1.adicionarItem(new Produto("Notebook", 2000),2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("caderno", 10, 10);
        compra2.adicionarItem(new Produto("Impressora", 1000),1);

        Cliente cliente = new Cliente("Maria Julia");
        cliente.adicionarCompra(compra1); //correto
        cliente.compras.add(compra2); // n eh bom fazer assim - lista exposta

        System.out.println(cliente.obterValorTotal());


    }
}
