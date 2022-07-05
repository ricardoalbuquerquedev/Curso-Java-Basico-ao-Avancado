package voltandoAoComeco.Secao5;

public class AreaCircunferenciaTeste {
    public static void main(String[] args) {
        AreaCircunferencia a1 = new AreaCircunferencia(10);
       // a1.pi = 1000000;


        AreaCircunferencia a2 = new AreaCircunferencia(5);
        //a2.pi = 0;
        AreaCircunferencia.PI =3.1415;   // a forma crt de acessar o pi é atraves da class

        System.out.println(a1.area());
        System.out.println(a2.area());

    }
}
