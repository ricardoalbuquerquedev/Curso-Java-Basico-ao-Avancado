package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é\n" + conjunto.size());
        System.out.println(conjunto.remove("teste"));// retorna false pq o Teste
        // que tem no conjunto é em maiúscula n existe teste
        System.out.println(conjunto.remove("Teste")); // dar true pq temos o Teste c T Maiúsculo
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho é\n" + conjunto.size()); // resulta em 3 pois removi 2

        System.out.println(conjunto.contains('x')); // resulta em false pois removi o x na linha 20
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet(); // existe + de um princípio d OO acontecendo aqui
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);
        System.out.println(conjunto);

        // para fazer a união entre os conjuntos podemos fazer:
        //conjunto.addAll(nums); //UNIÃOOO// isso vai alterar o conjunto
        conjunto.retainAll(nums); // resulta em 1 pois é o em comum nos dois conjuntos
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto); // resulta em vazio






    }
}
