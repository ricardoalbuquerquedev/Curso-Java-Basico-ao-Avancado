package excecao;

import jdk.swing.interop.SwingInterOpUtils;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {


            geraErro1();


        try {
            geraErro2();

        }catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }

    //Exceção Não checada ou não verificada
    static void geraErro1() throws RuntimeException {
      throw  new RuntimeException("Ocorreu um erro bem legal #01!");
    }
   //  Exceção  checada ou verificada
    static void geraErro2() throws Exception {
       throw  new Exception("Ocorreu um erro bem legal #02!");
    }
}
