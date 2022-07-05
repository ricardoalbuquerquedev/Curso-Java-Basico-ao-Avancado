package oo.revisao.Secao4;

import java.util.Scanner;

public class RefazendoDesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Informe a nota ou -1 p sair");
            nota = entrada.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeDeNotas++;
            } else if (nota != -1) {
                System.out.println("Nota inválida");
            }
        }

        double media = total/quantidadeDeNotas;
        System.out.println("Média"+ media);
        entrada.close();
    }


}

