package oo.revisao.Secao4;

import java.util.Scanner;

public class ExercExtraN9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maiorValor = 0;
        int contador = 0;
        do{
            System.out.println("Digite um número:  ");
            int valor = entrada.nextInt();
            if(valor >maiorValor){
                maiorValor=valor;
            }
            contador++;
        }while (contador !=10);
        System.out.printf("O maior valor é "+ maiorValor);
        entrada.close();
    }

}
