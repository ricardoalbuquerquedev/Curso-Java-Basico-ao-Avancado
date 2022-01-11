package Arrays;

import java.util.Arrays;

public class ExerciciosProf {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];    //notasAlunoA é o nome da variável
        System.out.println(Arrays.toString(notasAlunoA));
        notasAlunoA[0] = 7.9;
        notasAlunoA[1]= 8;
        notasAlunoA[2]= 6.7;
        notasAlunoA [3]= 9.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]); //saber primeira nota
        System.out.println(notasAlunoA[notasAlunoA.length-1]); // saber a ultima nota
        double totalAlunoA = 0;

        for(int i = 0; i< notasAlunoA.length;i++){
            totalAlunoA+=notasAlunoA[i];
        }
        System.out.println(totalAlunoA/notasAlunoA.length);
        double[] notasAlunoB = {6.9,8.9,5.5,10}; // array c dados literais sem
        // necessariamente fazer um por um igual acima, mas assim eh menos usado
        double totalAlunoB = 0;
        for(int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB +=notasAlunoB[i];
        }
        System.out.println(totalAlunoB/notasAlunoA.length);


    }
}
