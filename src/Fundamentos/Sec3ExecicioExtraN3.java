package Fundamentos;

import java.util.Scanner;

public class Sec3ExecicioExtraN3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o peso");
        double peso = entrada.nextDouble();
        System.out.println("Digite a altura");
        double altura = entrada.nextDouble();
        double imc = peso/ (altura *altura);
        System.out.println("O imc é:" + imc);
        entrada.close ();
    }
}
