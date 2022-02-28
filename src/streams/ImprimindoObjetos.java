package streams;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui","Luca", "Ana"); // <String> isso eh o generics
        System.out.println("Usando o foreach...");
        for (String nome: aprovados){
            System.out.println(nome);
        }
        System.out.println("\nUsando Iterator...");
        Iterator<String> iterator = aprovados.iterator(); // <String> isso eh o generics
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\nUsando Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); // Laço interno - parte do problema ja é resolvido
        // nativamente dentro da linguagem
    }
}
