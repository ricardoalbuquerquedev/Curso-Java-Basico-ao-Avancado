package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Gabi", 8.1);
        Aluno a3 = new Aluno("Gui", 6.1);
        Aluno a4 = new Aluno("Luna", 10);

        List<Aluno> alunos= Arrays.asList(a1,a2,a3,a4);
        Predicate<Aluno> aprovado = a->a.nota >= 7;
        Function<Aluno,Double> apenasNota = a-> a.nota;
        BinaryOperator<Double> somatorio = (a,b)-> a+b; // criei aqui a funcao de forma mais generica

        alunos.parallelStream()// operação de build
              .filter(aprovado) // op. intermediaria
                .map(apenasNota) // op. intermediaria
                .reduce(somatorio) //op. terminal .....tds eles sao minha pipeline
                .ifPresent(System.out::println);


    }
}
