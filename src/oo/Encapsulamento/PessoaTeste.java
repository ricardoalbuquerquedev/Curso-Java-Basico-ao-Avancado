package oo.Encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joaquim",-45); // me passou uma idade negativa faco Math.abs
        p1.setIdade(230); //alterar -alterei a partir de um método

        System.out.println(p1.getIdade()); //ler - e li a partir de um método
        System.out.println(p1); // aqui ele vai ta imprimindo o toString
    }


}
