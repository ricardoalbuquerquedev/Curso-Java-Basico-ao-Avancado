package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimirNome =
                p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Caderno", 25.87, 0.05);
        imprimirNome.accept(p1);
        Produto p2 = new Produto("Notebook", 3598.85, 0.25);
        Produto p3 = new Produto("Caneta", 15.44, 0.02);
        Produto p4 = new Produto("borracha", 8.57, 0.05);
        Produto p5 = new Produto("régua", 16.36, 0.04);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
        produtos.forEach(imprimirNome);  //imprimirNome é meu consumer
        produtos.forEach(p -> System.out.println(p.preco)); //lambda
        produtos.forEach(System.out::println); //method reference - referencia do metodo


    }
}
