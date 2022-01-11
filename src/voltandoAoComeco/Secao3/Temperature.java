package voltandoAoComeco.Secao3;

public class Temperature {
    public static void main(String[] args) {         // uhu acertei esse desafio
        //Fórmula: (ºF - 32) * 5/9 = ºC

        double f = 86;        // double é o tipo da variável, f é o nome 86 é o valor
        final double  C1= 32;
        final double C2 = 5.0/9.0;
        double celcius  = (f-C1)* C2;

        System.out.println("O resultado é"+ celcius+"º");
    }
}
