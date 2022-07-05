package oo.revisao.Secao6;

public class ForEeach {
    public static void main(String[] args) {

        double[] notas = {6.7, 8.5, 9.8, 3.1};

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]+ " ");
        }
        System.out.println();
        for (double nota : notas) {
            System.out.print(nota+ " ") ;
        }
    }
}