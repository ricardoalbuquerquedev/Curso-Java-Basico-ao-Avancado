package oo.revisao.Secao3;

import java.util.Scanner;

public class ExercExtraN5 {
    //Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.  UHU CERTO
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a base do triângulo:");
        double base = entrada.nextDouble();
        System.out.println("Digite a altura do triângulo:");
        double altura = entrada.nextDouble();
        double area = (base * altura) / 2;
        System.out.print("A área é:" + area);
        entrada.close();
    }
}

