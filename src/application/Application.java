package application;

import model.Aluno;
import model.Avaliacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    static List<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {


            Scanner entrada = new Scanner(System.in);
            System.out.println("1- Cadastrar um aluno");
            System.out.println("2- Cadastrar Avaliacao do Aluno");
            System.out.println("3 - Listar Todos os Alunos");
            System.out.println("0 - Sair do Sistema");

            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    cadastrarAvaliacao();
                    break;
                case 3:
                    listarTodosOsAlunos();
                    break;
                case 0:
                    System.exit(1);


            }
        }
    }

    public static void cadastrarAluno() {  // meu método cadastrar aluno


        String nome;
        String email;
        int idade;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe nome");
        nome = entrada.next();
        System.out.println("Informe email");
        email = entrada.next();
        System.out.println("Informe idade");
        idade = entrada.nextInt();


        Aluno aluno = new Aluno();  //meu construtor p eu instanciar meu obj.
        aluno.setNome(nome);
        aluno.setEmail(email);
        aluno.setIdade(idade);
        System.out.println(aluno.toString());
        alunos.add(aluno);

    }

    public static void cadastrarAvaliacao() {
        String pergunta;
        String resposta;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a pergunta");
        pergunta = entrada.nextLine();
        System.out.println("Informe a resposta");
        resposta = entrada.nextLine();

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setPergunta(pergunta);
        avaliacao.setResposta(resposta);
        System.out.println(avaliacao.toString());

    }

    public static void listarTodosOsAlunos() {
        System.out.println(alunos);
    }
}









