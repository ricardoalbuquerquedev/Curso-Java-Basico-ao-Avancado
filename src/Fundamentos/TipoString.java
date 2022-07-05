package Fundamentoss;

import java.sql.SQLOutput;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("olá pessoal".charAt(1)); //pego letras específicas dentro da String.
        String s = "boa tarde";    // A String é imutável
        s= s.toUpperCase();
        s= "bom dia "; // Mas posso dizer que s= "bom dia" que dar certo,
        // aqui eu substitui o valor
        s= s.toUpperCase();
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("boa")); // só treinando aqui os starts)
        System.out.println(s.startsWith("hoje"));
        System.out.println(s.startsWith("bom"));
        String b = "mais tarde";
        System.out.println(b.startsWith("mais"));
        System.out.println(b.startsWith("Mais")); // aqui coloquei o mais com letra maiuscula
        // entao eles e torna falso pq na String está minusculo.
        // se eu colocar um .toLowerCase ele vai dar true pq estou pedindo para ele nao se deter a
        // minusculo e maiusculo.
        System.out.println(b.toLowerCase().startsWith("Mais"));

        System.out.println(s.length());
        String w = "o i";
        System.out.println(w.length());  // o length conta o espaco como caractere
        System.out.println(b.endsWith("tarde"));
        String n= "boneca de pano"; // eu q inventei p testar
        System.out.println(n.startsWith("boneca"));
        System.out.println(n.length());
        System.out.println(n.equals("Boneca de pano"));
        System.out.println(n.equalsIgnoreCase("Boneca de pano"));

        var nome= "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario =12345.987;
        System.out.println("Nome:"+ nome + "\nSobrenome:"+ sobrenome +  "\nIdade:" +idade+ "\nSalario" +salario);
        System.out.printf("O senhor %s %s  tem %d anos e ganha R$ %f", nome, sobrenome, idade,salario);

        String frase = String.format("\nO senhor %s %s  tem %d anos e ganha R$%f", nome, sobrenome, idade,salario);
        System.out.println(frase);
        System.out.println("frase qualquer".contains("qual"));
        System.out.println("frase qualquer".indexOf("qual")); // dará seis pq é a partir
        // do seis que aparecerá a palavra qual, lembrando que considero o espaco na contagem
        System.out.println("frase qualquer".substring(6));
        System.out.println("frase qualquer".substring(6,8));
        System.out.println("frase qualquer".substring(6,10));

        String d = "Priscilla Maria";
        System.out.println(d.length());
    }
}
