package oo.revisao;

public class EuTreinoMercadoriaTeste {
    public static void main(String[] args) {

        //int f = 8;
       // Scanner entrada = new Scanner(System.in);   // aqui eu tenho o tipo - Scanner o nome
        // da variável- entrada o new chama o construtor , o nome do construtor é exatamente o nome da class. A classe
        // define o tipo, então temos

         EuTreinoMercadoria m1 = new EuTreinoMercadoria();
         m1.nome = "saia";
         m1.preco = 34.98;
         m1.desconto = 0.1;

         var m2 = new EuTreinoMercadoria();
         m2.nome = "blusa";
         m2.preco= 56.79;
         m2.desconto= 0.2;
        System.out.println(m1.nome);
        System.out.println(m2.nome);
        double precoFinal = m1.preco *(1-m1.desconto);






    }
}
