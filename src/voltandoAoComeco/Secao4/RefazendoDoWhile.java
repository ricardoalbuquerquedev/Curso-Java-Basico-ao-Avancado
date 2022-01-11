package voltandoAoComeco.Secao4;

import java.util.Scanner;

public class RefazendoDoWhile {
    public static void main(String[] args) {
        // do While - pelo menos uma vez o trecho de codigo é executado
        Scanner entrada = new Scanner(System.in);
        String texto = "";


        do{
            System.out.println("Fale a palavra mágica");
            System.out.println("Quer ir embora?");
            texto = entrada.nextLine();
        }while (!texto.equalsIgnoreCase("please"));

        System.out.println("Thanks");
        entrada.close();
    }

}
