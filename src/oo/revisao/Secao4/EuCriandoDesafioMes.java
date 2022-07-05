package oo.revisao.Secao4;

import java.util.Scanner;

public class EuCriandoDesafioMes {
    public static void main(String[] args) {
        // Janeiro imprima 1 Fevereiro 2, Marco 3 até Dezembro 12
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o mês");

        String mes = entrada.next();
        if (mes.equals("Janeiro")) {
            System.out.println(1);
        } else if (mes.equals("Fevereiro")) {
            System.out.println(2);
        } else if (mes.equals("Marco")) {
            System.out.println(3);
        } else if (mes.equals("Abril")) {
            System.out.println(4);
        } else if (mes.equals("Maio")) {
            System.out.println(5);
        } else if (mes.equals("Junho")) {
            System.out.println(6);
        } else if (mes.equals("Julho")) {
            System.out.println(7);
        } else if (mes.equals("Agosto")) {
            System.out.println(8);
        } else if (mes.equals("Setembro")) {
            System.out.println(9);
        } else if (mes.equals("Outubro")) {
            System.out.println(10);
        } else if (mes.equals("Novembro")) {
            System.out.println(11);
        } else if (mes.equals("Dezembro")) {
            System.out.println(12);
        }
        entrada.close();
    }
}
