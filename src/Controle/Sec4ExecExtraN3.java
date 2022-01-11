package Controle;

import javax.swing.*;
import java.util.Scanner;

public class Sec4ExecExtraN3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nota Parcial 01");
        double nota1 = entrada.nextDouble();
        System.out.println("Nota Parcial 02");
        double nota2 = entrada.nextDouble();

         double media = (nota1 + nota2)/2;
        if (media >= 7.0){
            System.out.println("Aprovado");
        }
        else if (media > 4.0){
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
           entrada.close();

    }

}
