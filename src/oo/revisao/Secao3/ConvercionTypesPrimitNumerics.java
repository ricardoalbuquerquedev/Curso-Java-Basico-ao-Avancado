package oo.revisao.Secao3;

public class ConvercionTypesPrimitNumerics {
    public static void main(String[] args) {
        double a = 5;    //o 5 é inteiro mas n tem problema de eu botar double 5 aqui há uma conversao implicita
        System.out.println(a);

        // CAST é uma conversão explicita
        float x = (float) 1.23456777;  // estou deixando explicito a minha conversao p float sabendo q perco informação
        System.out.println(x);
    }
}
