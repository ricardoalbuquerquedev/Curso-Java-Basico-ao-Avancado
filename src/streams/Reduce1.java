package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer>nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        BinaryOperator<Integer>soma = (ac,n)->ac + n;

        int total1= nums.parallelStream().reduce(soma).get(); // da forma que chamei reduce aqui ele eh optional de integer pq usei get(opcional de inteiro)
        System.out.println(total1);

        Integer total2 = nums.stream().reduce(100,soma); // stream serial
        System.out.println(total2);

        //Resultado foi um Optional<Integer> (opcional de Integer)
        nums.stream()
                .filter(n-> n> 5)
                .reduce(soma)
                .ifPresent(System.out::println);
    }
}
