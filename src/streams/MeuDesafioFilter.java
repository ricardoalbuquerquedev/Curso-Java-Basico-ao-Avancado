package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class MeuDesafioFilter {

    public static void main(String[] args) {

        Produto p1 = new Produto("notebook ",3100.47);
        Produto p2 = new Produto("Caderno ",40.54);
        Produto p3 = new Produto("Bolsa ",210.78);
        Produto p4 = new Produto("Tv ",2155.85);
        Produto p5 = new Produto("Quadro ",80.43);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
        Predicate<Produto> barato = p-> p.preco <=500;
        Predicate<Produto> produtoRelevante = p-> p.preco>=20;

        Function<Produto,String> saudacaoBarato = a->a.nome + "Produto em conta ";

        produtos.stream()
                .filter(produtoRelevante)
                .filter(barato)
                .map(saudacaoBarato)
                .forEach(System.out::println);


    }
}
