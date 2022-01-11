package Controle;

import java.util.Scanner;

public class Sec4ExercExtraN4 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número para saber se é primo");
        int contadorDeDivisores =  0 ;
        int numero = entrada.nextInt();
        for (int i = 2;i<numero; i++){
            if(numero %i ==0){
                contadorDeDivisores ++;
            }
        }
        if (contadorDeDivisores==0){
            System.out.println( " \n O numero "  + numero +  " é primo. " );
        }
        else {
            System.out.println("\n O numero"+ numero+ "não é primo");
        }
        entrada.close();
    }
}
