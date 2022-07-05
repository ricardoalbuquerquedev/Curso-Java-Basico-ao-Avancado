package voltandoAoComeco.Secao6;

import java.util.Arrays;

public class Exercicioo {
    public static void main(String[] args) {
        double[] notasAlunoX = new double[4];
        System.out.println(Arrays.toString(notasAlunoX));
        notasAlunoX[0] = 9.0;
        notasAlunoX[1] = 7.7;
        notasAlunoX[2]= 5.9;
        notasAlunoX[3]= 8.9;

        System.out.println(Arrays.toString(notasAlunoX));
        double totalAlunoX =0;
        for(int i = 0; i < notasAlunoX.length; i++) {   // length é atributo e n comportamento
            totalAlunoX += notasAlunoX[i];
        }
        System.out.println(totalAlunoX/notasAlunoX.length);

        double[] notasAlunoY = {8.6, 9.4, 6.7, 8.1};  // é menos comum fazer assim c dados fixos
        double totalAlunoY= 0;
        for (int i = 0; i < notasAlunoY.length; i++) {
            totalAlunoY+=notasAlunoY[i];
        }
        System.out.println(totalAlunoY/notasAlunoY.length);

    }
}
