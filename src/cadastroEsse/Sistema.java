package cadastroEsse;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    Scanner teclado = new Scanner(System.in);
    ArrayList<Pessoa> pessoas = new ArrayList();

    public void menu() {

        System.out.println("Menu");
        System.out.println("1- Cadastrar novo usuário");
        System.out.println("2- Enviar Sms");
        System.out.println("3- Ler Sms");
        System.out.println("4- Ver usuarios cadastrados");
        System.out.println("0- Sair");

    }
     public void listarUsuario(){

     }
     public  void cadastrarUsuario() {
        String nome;
        Integer cpf;
        Integer telefone;

        System.out.println("Informe o nome do Usuário");
        nome = teclado.nextLine();

        System.out.println("Informe o CPF");
        cpf = teclado.nextInt();
        System.out.println("Informe o Telefone");
        telefone = teclado.nextInt();
        teclado.reset();
        Pessoa pessoa = new Pessoa(nome, cpf, telefone, null);
        pessoas.add(pessoa);
    }


}


