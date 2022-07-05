package voltandoAoComeco.Secao5;

import Classe.Data;

public class ValorVssReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // nesse caso eu fiz atribuicao por valor ( TIPO PRIMITIVO)
        a++;
        b--;
        System.out.println(a+ " "+b);

        RefazendoDesafioData d1 = new RefazendoDesafioData(1,06,2023);
        RefazendoDesafioData d2= d1;  // atribuição por Referência. (Objeto)

        d1.dia = 9;
        d2.mes = 12;
        d1.ano = 2030;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        voltarDataparaValorPadrao(d1);    // chamada do método

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

    }
         static void voltarDataparaValorPadrao (RefazendoDesafioData z){  // n é boa prática
        z.dia= 7;
        z.mes = 10;
        z.ano = 2015;


         }
}
