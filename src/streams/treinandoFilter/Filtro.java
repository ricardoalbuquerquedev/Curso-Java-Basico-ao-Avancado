package streams.treinandoFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filtro {
    public static void main(String[] args) {
        Item it1 = new Item("Teclado", 1480.46);
        Item it2 = new Item("Monitor", 2352.89);
        Item it3 = new Item("CPU", 3365.51);
        Item it4 = new Item("Mouse", 381.52);
        Item it5 = new Item("Mousepad", 159.97);

        List<Item> itens = Arrays.asList(it1, it2, it3, it4, it5);
        Predicate<Item> barato = i -> i.preco <= 2000;

        Function<Item, String> produtoBarato = i -> "Excelente preço " + i.nome;


        itens.stream()
                .filter(barato)
                .map(produtoBarato)
                .forEach(System.out::println);


    }
}
