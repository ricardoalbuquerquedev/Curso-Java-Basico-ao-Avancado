package voltandoAoComeco.Secao6.Colecoes;

import java.util.HashSet;

public class ConjuntoBbaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é"+conjunto.size());
        System.out.println(conjunto.remove("Teste"));  // o remove resulta em true ou false
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println(conjunto.contains(1.2));
        System.out.println(conjunto.contains('x'));
    }
}
