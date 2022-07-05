package voltandoAoComeco.Secao3;

public class TreinandoDataTeste {
    public static void main(String[] args) {

        TreinandoData dt1 = new TreinandoData();
        dt1.dia= 04;
        dt1.mes = 11;
        dt1.ano= 2000;

        TreinandoData dt2 = new TreinandoData();
        dt2.dia = 10;
        dt2.mes = 8;
        dt2.ano = 2016;

        System.out.println(dt1.ano);
        System.out.println(dt2.ano);
    }
}
