package oo.revisao.Secao6;

import java.util.Date;

public class Eequals {
    public static void main(String[] args) {


        Uusuario u1 = new Uusuario();
        u1.nome = "Pati Lima";
        u1.email = "plima@ezemail.com";
        Uusuario u2 = new Uusuario();
        u2.nome = "Pati Lima";
        u2.email = "plima@ezemail.com";
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        System.out.println(u2.equals(new Date()));

    }
    }

