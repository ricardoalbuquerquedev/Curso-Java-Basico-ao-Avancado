package oo.revisao.Secao4;

import java.util.Scanner;

public class RefazendoWhileIndeterm {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        // a estrutura while pode ser executada zero vezes ou indeterminado numero d vezes

        String valor = " ";
        while(!valor.equalsIgnoreCase("sair")){  // enquanto dentro da variavel valor
            // n tiver sair imprima "vc escreve", ou enquanto valor  for diferente de sair imprima vc esc.
            System.out.print("Voce escreve");
            valor =entrada.nextLine();
        }
     entrada.close();
    }

}
