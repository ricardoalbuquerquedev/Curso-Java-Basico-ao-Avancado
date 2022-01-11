package oo.composição.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;
   final List<Compra> compras = new ArrayList<>();

    Cliente (String nome){ // fiz um construtor
        this.nome = nome;
    }
    void adicionarCompra(Compra compra) {
        this.compras.add(compra);
    }
    double obterValorTotal(){
        double total = 0;
          // o primeiro Compra de for abaixo é nome da class
        for(Compra compra: compras){ // o segundo compra é o nome da variável mas poderia ser outro
            total += compra.obterValorTotal();
            // n terminei ainda
        }
        
        return total;
    }
}
