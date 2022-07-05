package voltandoAoComeco.Secao3;

public class DotNotation {
    public static void main(String[] args) {
        double a = 2.3;
        String  s = "Buenos dias x";
        // NOTAÇOES PONTOS SÃO COMPORTAMENTOS , MÉTODOS.

       s= s.replace("x","Sarah");     //o .replace substitui//
       s = s.toUpperCase(); // .toUpperCase deixa td maiúsculo, ele é um método
       s=s.concat("!!!");    // concatenar
      System.out.println(s);
      System.out.println("Aninha".toUpperCase().length());

      //TIPOS PRIMITIVOS NÃO TEM OPERADOR PONTO. ELES SOH ARMAZENAM O VALOR DELES E NADA MAIS.

    }
}
