package Controle;

import java.util.Scanner;

public class Sec4ExecExtraN1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número");
        int numero = entrada.nextInt();
        if(numero >0 && numero <10){
            System.out.println(numero %2 ==0);
        }
        else {

        }
        entrada.close();
    }
}
