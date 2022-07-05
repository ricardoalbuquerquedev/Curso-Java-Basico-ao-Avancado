package oo.revisao.Secao5;

public class DesafioTraumaUm {
    int a = 3;// esse atributo pertence à instância
    static int b = 6; // p eu acessar diretamente o b , coloquei um static nele.
    // algo estático pode acessar algo estático

    public static void main(String[] args) {   // esse metodo é static ou seja pertence a class

        // eu soh consigo a partir de  um método de classe acessar um atributo de instância
        // se antes eu criar uma instância. Ou seja, mesmo estando na própria classe você só
        // consegue acessar um membro de instância a partir de um método estático se você
        // criar uma instância então sou obrigada a criar um instância
        DesafioTraumaUm p = new DesafioTraumaUm();  // criei uma instância
        System.out.println(p.a); // acessei
        System.out.println(b); //

    }
}
