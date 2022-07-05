package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Gabi", 8.1);
        Aluno a3 = new Aluno("Gui", 6.1);
        Aluno a4 = new Aluno("Gil", 10);
        Aluno a5 = new Aluno("Petra", 9.2);
        Aluno a6 = new Aluno("Ana", 7.4);
        Aluno a7 = new Aluno("Gil", 5.6);
        Aluno a8 = new Aluno("Vanda", 3.7);

        List<Aluno> alunos= Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);

        System.out.println("Distinct...");
        alunos.stream().distinct().forEach(System.out::println);
    }
}
