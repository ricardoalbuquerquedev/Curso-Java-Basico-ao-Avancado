package oo.revisao.Secao4;

import java.util.Scanner;

public class RevendoIfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a nota");

        double nota = entrada.nextDouble();
        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida");
        } else if (nota >= 8.9) {
            System.out.println("Gênio");
        }else if (nota >= 8.3){
            System.out.println("muito sabido");
        }else if(nota>= 7.5){
            System.out.println("Inteligente");
        }else if (nota >=6.0) {
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovadão");
        }


        entrada.close();
    }

}
