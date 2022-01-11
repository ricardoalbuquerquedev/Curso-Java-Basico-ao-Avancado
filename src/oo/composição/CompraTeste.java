package oo.composição;

public class CompraTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";

        compra1.itens.add(new Item("caneta,", 20, 7.45));
        compra1.itens.add(new Item("borracha,", 12, 3.89));
        compra1.itens.add(new Item("caderno,", 3, 18.79));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());

    }
}
