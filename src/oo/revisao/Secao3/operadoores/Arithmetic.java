package voltandoAoComeco.Secao3.operadoores;

public class Arithmetic {
    public static void main(String[] args) {
        var a = 81.32;
        double b = 21.23;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        int x = 10;
        int y = 4;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y); // deu 2 o resultado,mas divisao de numero inteiro smp dar inteiro

        // operador % modulo p calcular o resto da divisão:
        System.out.println(10 % 4);
        // ou a variável
        System.out.println(x % y);
    }
}
