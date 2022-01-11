package streams;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out:: print;
        Consumer<Integer> println = System.out:: println;

        Stream<String> langs=  Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);
        String [] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs,1,3).forEach(print);
        List<String> outrasLangs = Arrays.asList("\nC ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        //Stream.generate(()->"a").forEach(print); // gera "a" infinitamente
        Stream.iterate(0,n->n+1).forEach(println); // de maneira infinita ele gera milhares
        // de valores 1 atras do outro até eu dar stop

    }
}
