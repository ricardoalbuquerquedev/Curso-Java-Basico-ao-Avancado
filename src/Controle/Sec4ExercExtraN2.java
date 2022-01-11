package Controle;

import java.util.Scanner;

public class Sec4ExercExtraN2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o ano");
        int ano = entrada.nextInt();
        int bissexto = ano %4;
        if(bissexto ==0){
            System.out.println(ano +"É Ano bissexto");
        }
        else {
            System.out.println(ano + "Não é ano bissexto");
        }
        entrada.close();
    }
}
