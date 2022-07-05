package voltandoAoComeco.Secao5;

public class RefazendoDesafioDataTeste {
    public static void main(String[] args) {
        RefazendoDesafioData d1 = new RefazendoDesafioData();
        d1.ano = 1999;

        var d2 = new  RefazendoDesafioData(25,12,2017);

        System.out.printf("\n%d/%d/%d", d2.dia, d2.mes,d2.ano);
        System.out.printf("\n%d/ %d/ %d", d1.dia, d1.mes,d1.ano);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();



    }


}
