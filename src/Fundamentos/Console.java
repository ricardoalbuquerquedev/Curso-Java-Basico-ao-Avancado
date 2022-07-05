package Fundamentoss;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print ("bom");
        System.out.print (" dia\n");
        System.out.println("bom");
        System.out.println("dia");
        System.out.printf("Megasena: %d %d %d %d %d %d %n",1,2,3,4,5,6);
        System.out.printf("Salario %.1f%n", 1234.5678);
        System.out.printf("Nome: %s%n", "João");

        Scanner entrada = new Scanner(System.in); // entrada do sistema
        System.out.print("Digite o seu nome:"); // consegui imprimir p digitar
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome"); // consegui imprimir p digitar
        String sobrenome = entrada.nextLine();
        System.out.println("\nNome:" + nome + " " + sobrenome);
        System.out.print("Digite a sua idade");
        int idade = entrada.nextInt(); // nesse caso coloco int no Lugar de String
        // e coloco .nextInt porque se trata do proximo inteiro
        System.out.printf("%s %s tem %d anos %n", nome, sobrenome,idade);
        entrada.close();





    }
}
