package projetoTop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    List<Pessoa> pessoas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void inicializar() {
        carga();
        while (true) {
            menu();
        }

    }

    public void menu() {
        int opcao;

        System.out.println("--------Menu-------");
        System.out.println("1- Cadastrar Usuário-");
        System.out.println("2-Listar Usuários-");
        System.out.println("3- Enviar sms-");
        System.out.println("4- Ler sms-");
        System.out.println("0- Sair-");

        opcao = scanner.nextInt();
        scanner.nextLine();
        escolha(opcao);
    }

    public void escolha(int opcao) {

        switch (opcao) {
            case 1:
                cadastrar();
                break;
            case 2:
                listarUsuarios();
                break;
            case 3:
                enviarSms();
                break;
            case 4:
                lerSms();
                break;
            case 0:
                System.exit(1);

        }
    }

    public void lerSms() {
        int cpf;

        System.out.println("Deseja ler sms de qual usuário?");

        cpf = scanner.nextInt();
        scanner.nextLine();

        for (Pessoa p : pessoas) { // esse é o forEach
            if (p.getCpf() == cpf) {
                if (p.getListaSms() == null) {
                    System.out.println("Usuário não possui sms.");
                    break;

                }
                for (String mensagem : p.getListaSms()) {
                    System.out.println(mensagem);
                }
            }
        }

    }

    public void listarUsuarios() {
        for (Pessoa p : pessoas) {
            System.out.println(p);

        }
    }

    public void cadastrar() {
        String nome;
        Integer cpf;
        Integer tel;
        System.out.println("Nome");
        nome = scanner.nextLine();
        System.out.println("cpf");
        cpf = scanner.nextInt();
        System.out.println("Tel");
        tel = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, cpf, tel, null);
        pessoas.add(pessoa);
    }

    public void carga() {
        Pessoa p1 = new Pessoa("Ana", 4252, 245, null);
        Pessoa p2 = new Pessoa("Petra", 2089, 301, null);
        Pessoa p3 = new Pessoa("Guia", 9876, 987, null);
        Pessoa p4 = new Pessoa("Tania", 6549, 576, null);

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
    }

    public void enviarSms() {
        int telefone;
        boolean existeUsuario = false;
        String mensagem;

        System.out.println("Para quem será a Sms");
        telefone = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe a mensagem:");
        mensagem = scanner.nextLine();

        for (Pessoa p : pessoas) {
            if (p.getTelefone() == telefone) {
                existeUsuario = true;
                if (p.getListaSms() == null) {// se eu obter uma lista nula eu vou
                    p.setListaSms(new ArrayList<String>()); // modificar criando uma nova lista do tp String
                }
                p.getListaSms().add(mensagem);
            }
        }
        if (existeUsuario == false) {
            System.out.println("Usuário não encontrado.");
        }
    }
}
