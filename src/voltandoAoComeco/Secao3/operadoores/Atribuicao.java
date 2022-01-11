package voltandoAoComeco.Secao3.operadoores;

public class Atribuicao {
    public static void main(String[] args) {

        int a = 4;
        int b = a;
        int c = a +b;

        c+=b;
        c-=a;
        c*=b;
        c/=a;
        System.out.println(c);
        c %= 2;
        c++; // c= c + 1 // c++ é unário de incremento mas serve tb como atribuicao
        // algum numero %2 ou dará 0 ou 1, se for 0 significa que o numero é par e se der 1 é impar.

        System.out.println(c);
    }
}
