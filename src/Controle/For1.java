package Controle;

public class For1 {
    public static void main(String[] args) {
        // no for vc tem uma quantidade determinada de repeticoes
        //1ªdeclaração da variavel, 2ª a expressao q retorna true or false
        // 3ª manipulação da variável de controle

        for (int contador = 1;contador<= 10;contador++){
            System.out.printf("i= %d", contador);
        } //jeito menos comum de fazer abaixo
        int x =2;
        for(;x< 10;){
            System.out.println("x= "+ x);
            x++;
        }
    }
}
