package voltandoAoComeco.Secao3;

public class conversionNumberToString {
    public static void main(String[] args) {
        Integer num1= 20000; // aqui to usando Wrapper o Interger
        System.out.println(num1.toString().length());  // com o .toString eu converti um Interger
        // p uma String, eu coloquei o length, eu posso por se tratar d String

        int num2 = 300000;
        System.out.println(Integer.toString(num2).length()); //posso colocar diretamente a classe wrapper no toString
    }
}
