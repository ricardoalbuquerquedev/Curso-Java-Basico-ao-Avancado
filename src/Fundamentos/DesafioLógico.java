package Fundamentoss;

public class DesafioLógico {
    public static void main(String[] args) {
        //Trabalho na terça V ou F
        // Trabalho na quinta V ou F
        boolean trabalho1 = true; // fica mudando p true e false e imprime
        boolean trabalho2 = true; // fica mudando p true e false imprime

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        //Operador Unário
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50?\n" + comprouTV50);
        System.out.println("Comprou TV 32?\n" + comprouTV32);
        System.out.println("Comprou Sorvete?" + comprouSorvete);
        System.out.println("Mais saudável?" +maisSaudavel);


    }
}
