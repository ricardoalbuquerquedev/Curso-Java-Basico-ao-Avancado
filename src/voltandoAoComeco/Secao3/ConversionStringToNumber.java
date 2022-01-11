package voltandoAoComeco.Secao3;

import javax.swing.*;

public class ConversionStringToNumber {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite primeiro nº");
        String valor2 =JOptionPane.showInputDialog("Digite segundo nº");
        System.out.println(valor1+valor2); // por se tratar de Strings vai haver uma
        // concatenação, vai juntar os 2 resultados assim: 6.79.8

        // agora vamos converter uma String em numero
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.println("Soma é:"+soma);
        System.out.println("Média é:"+soma/2);

    }
}
