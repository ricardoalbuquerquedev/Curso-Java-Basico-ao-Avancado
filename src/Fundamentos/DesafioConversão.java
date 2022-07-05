package Fundamentos;

import java.util.Scanner;

public class DesafioConversão {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro salário");
        String salário1 = entrada.nextLine().replace(",",".");
        System.out.println("Digite o segundo salário");
        String salário2 = entrada.nextLine().replace(",",".");
        System.out.println("Digite o terceiro salário");
        String salário3 = entrada.nextLine().replace(",",".");


        Double num1 = Double.parseDouble(salário1);
        Double num2 = Double.parseDouble(salário2);
        Double num3 = Double.parseDouble(salário3);
        Double soma = num1+num2+num3;
        System.out.println("Soma é" + soma);
        System.out.println("Média é" +soma/3);







    }
}
