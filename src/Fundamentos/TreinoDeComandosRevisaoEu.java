package Fundamentos;

public class TreinoDeComandosRevisaoEu {
    public static void main(String[] args) {
        String a = "Oi Brasil";
        a = a.toUpperCase();
        System.out.println(a);
        a= a.toLowerCase();
        System.out.println(a);
        System.out.println(a.concat("!!!"));
        System.out.println(a.startsWith("Oi"));
        System.out.println(a.length());
        String p = "Fala amanhã";
        System.out.println(p.charAt(3));
        System.out.println(p.endsWith("Amanhã")); // false porque começa na String com a minúsculo
        System.out.println(p.equals("leitura"));
        System.out.println(p.equals("fala")); // deu falso pq o Fala da String
        // p começa com letra maiúscula
        System.out.println(p.equals("Fala amanhã"));
        System.out.println(p.contains("ala"));
        System.out.println(p.contains("nunca"));

        String h = "Grande Frases";
        System.out.println(h.indexOf("rase"));
        System.out.println(h.substring(4));
        System.out.println(h.substring(2,9));
        System.out.println(h.replace("Grande" ,"extensas"));

        var nome = "Rebecca";
        var sobrenome = "Maria";
        var idade = 28;
        var salario = 5800.35;
        System.out.println( );
        System.out.printf("A senhorita %s %s tem %d anos e recebe %f", nome, sobrenome,idade, salario);
        System.out.printf("\nA senhorita %s %s tem %d anos e recebe %.2f", nome, sobrenome,idade, salario);
        // esse %.2f que coloquei acima foi para diminuir as casas decimais
        // e deixar só dois números após a vírgula.
    }
}
