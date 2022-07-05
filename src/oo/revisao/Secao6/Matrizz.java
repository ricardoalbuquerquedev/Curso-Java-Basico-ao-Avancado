package oo.revisao.Secao6;

import java.util.Scanner;

public class Matrizz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.print("Quantos alunos?");
        int quantDeAlunos = entrada.nextInt();

        System.out.print("Quantidade de notas por aluno?");
       int  quantDeNotas = entrada.nextInt();

       double[][] notasDaTurma = new double[quantDeAlunos][quantDeNotas];

       double total =0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {

                System.out.printf("Informa da nota %d  do aluno %d", n+1, a+1);

                notasDaTurma[a][n]= entrada.nextDouble();
                total+= notasDaTurma[a][n];
            }
        }
        double media = total/ (quantDeAlunos*quantDeNotas);
        System.out.println("Média da turma é:" + media);

        entrada.close();
    }
}
