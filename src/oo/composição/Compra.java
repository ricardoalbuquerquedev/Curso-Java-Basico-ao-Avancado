package oo.composição;

import java.util.ArrayList;

public class Compra {

    public String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    double obterValorTotal(){
        double total = 0;
        for(Item item:itens) {
            total += item.quantidade * item.preco;
            
        }

        return total;
    }
}
