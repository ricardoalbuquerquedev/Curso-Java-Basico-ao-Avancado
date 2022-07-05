package voltandoAoComeco.Secao3;

import java.util.Scanner;

public class CalculationDesaf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informa o numero:");
        double num1= entrada.nextDouble();

        System.out.print("Informa o numero:");
        double num2= entrada.nextDouble();

        System.out.print("Informe a operacao");
        String operacao= entrada.next();

        System.out.printf("%f %s %f =?", num1,operacao,num2);
        entrada.close();

    }
}
