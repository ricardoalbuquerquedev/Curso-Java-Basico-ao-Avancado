package Fundamentoss;

import java.util.Scanner;

public class RespostaDesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o primeiro salário:");
        String valor1 = entrada.next().replace(",",".");
        System.out.print("Infome o segundo salário:");
        String valor2 = entrada.next().replace(",",".");
        System.out.print("Informe o terceiro salário:");
        String valor3 = entrada.next().replace(",",".");

        double salário1= Double.parseDouble(valor1);
        double salário2= Double.parseDouble(valor2);
        double salário3= Double.parseDouble(valor3);
        double media = salário1 + salário2+ salário3;
        System.out.println("A média dos salários é:"+media);
        entrada.close();

    }
}
