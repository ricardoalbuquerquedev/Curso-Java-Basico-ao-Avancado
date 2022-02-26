package cadastro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner teclado = new Scanner(System.in);

        int opcao;
        sistema.menu();


        while (true) {
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    sistema.cadastrarUsuario();
                    sistema.menu();
                    break;
                case 2:
                    //sistema.enviarsms();
                    break;
                case 0:
                    System.exit(1);
                default:
                    sistema.menu();


            }

        }

    }
}