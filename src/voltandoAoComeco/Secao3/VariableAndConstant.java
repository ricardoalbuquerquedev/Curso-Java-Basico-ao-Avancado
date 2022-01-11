package voltandoAoComeco.Secao3;

public class VariableAndConstant {
    public static void main(String[] args) {
        double raio = 2.1;
      final  double PI = 3.1415;   // para tornar uma variável em uma constante eu uso o "final" agr
                                    // n posso mudar o valor de PI
                                   // por convenção nome de contante é td maiúsculo
        double area = PI* raio* raio;

        System.out.println(area);
        raio = 12;
        area= PI* raio* raio;
        System.out.println("Area é "+ area+ "m2");
    }
}
