package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //1. Numero para String binária... 6=> "110"
        //2. Inverter a String "110" => "011"
        //3. Converter de volta para inteiro "011" =>3

        UnaryOperator<String> inverter =
                s-> new StringBuilder(s).reverse().toString(); // StringBuilder é uma classe que ajuda a manipular strings
        Function<String, Integer> bionarioParaInt=
                s-> Integer.parseInt(s,2);

        nums.stream() // aqui gerei a stream (operação build - construção)
                .map(Integer::toBinaryString) // referencia do metodo , aqui fiz uma op.intermediaria
                .map(inverter) //aqui fiz uma op.intermediaria
                .map(bionarioParaInt) //aqui fiz uma op.intermediaria
                .forEach(System.out::println); // op. de terminação o forEach
    }
}
