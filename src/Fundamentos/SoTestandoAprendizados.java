package Fundamentos;

import java.util.Date;

public class SoTestandoAprendizados {
    public static void main(String[] args) {
        Date d= new Date();
        System.out.println(d);
        // Tipo String
        // String é imutável!
        System.out.println("Fala Brasileiro".charAt(6));
        String s = "Vida Boa";
        System.out.println(s.concat("!!!"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase().startsWith("v"));
        System.out.println(s.startsWith("V"));
        System.out.println(s.length());
        System.out.println(s.equals("vida boa"));
        System.out.println(s.equalsIgnoreCase("vida boa"));

        var nome = "Roberta";
        var sobrenome = "Campos";
        var idade = 21;
        var manequim = 38;
        System.out.printf("Nome: %s %s tem %d anos e veste %d\n", nome, sobrenome,idade, manequim);
        String f= "Mulher de preto";
        System.out.println(f.contains("pre"));
        System.out.println(f.contains("of"));
        System.out.println(f.indexOf("de"));
        System.out.println(f.substring(3));
        System.out.println(f.substring(3,8));

        //Operações
        int a = 46;
        int b = 10;
        System.out.println(a/b);
        System.out.println(46%10);
        int c = 4+8*6;
        System.out.println(Math.pow(a,2));
        // operadores
        boolean condicao1 = true;
        boolean condicao2 = 5>9;
        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);









    }
}
