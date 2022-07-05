package oo.revisao.Secao5;

public class Almocco {
    public static void main(String[] args) {

        Ccomida c1 = new Ccomida("Lasanha", 0.4);
        Ccomida c2 = new Ccomida("Camarão", 0.2);

        Gente g = new Gente("Gigi", 50.9);
        System.out.println(g.apresentar());

        g.comer(c1);
        System.out.println(g.apresentar());
        g.comer(c2);
        System.out.println(g.apresentar());

    }
}
