package oo.revisao.Secao3;

public class StringType {
    public static void main(String[] args) {

        // A String É UM OBJETO IMUTÁVEL!!!!
        System.out.println("Arquidiocese".charAt(4)); // para saber qual caractere ta no 4, é o "i"
        System.out.println("Rebecca Antonia".charAt(3)); // o caractere q ta no 3 é "e"
        // a partir de um valor literal String eu consigo chamar as funcionalidades da String
        String g = "Good Night".concat("!!");
        System.out.println(g);
        System.out.println(g.startsWith("Go"));
        System.out.println(g.length());
        System.out.println(g.equals("boa"));
        System.out.println(g.equalsIgnoreCase("good night"));

        var nome = "Mariana";
        var sobrenome = "Farias";
        var idade= 21;
        var salario= 13235.44;
        System.out.println("Nome:"+ nome+" "+ "Sobrenome:"+sobrenome+" "+ "Idade:"+idade+" "+"Salário:"+salario);
        System.out.printf("A senhorita %s %s tem %d e ganha R$%.2f",nome,sobrenome, idade,salario);
    }
}
