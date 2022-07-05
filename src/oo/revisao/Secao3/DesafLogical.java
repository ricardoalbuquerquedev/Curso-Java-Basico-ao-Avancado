package oo.revisao.Secao3;

public class DesafLogical {
    public static void main(String[] args) {

        // Trabalho1 segunda (V ou F) se um dos trab. der crt compro um sofa
        // Trabalho2 quarta (Vou F) se os dois trabalhos derem crt compro um apartamento
        // ou um ou outro dando crt saimos tds p jantar

        boolean trabalho1 = false;
        boolean trabalho2= true;

        boolean comprouApto = trabalho1 && trabalho2;
        boolean comprouSofa = trabalho1 ^ trabalho2;
        boolean foramJantar = trabalho1 || trabalho2;

        //Operador unário:
        boolean maisSaudavel = !foramJantar;
         System.out.println("Comprou apto?" + comprouApto);
         System.out.println("Comprou sofa?" + comprouSofa);
         System.out.println("Foram Jantar?" + foramJantar);
        System.out.println("Mais saudável?"+ maisSaudavel);



    }
}
