package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s= "Bom dia X";
        s= s.toUpperCase();   // para deixar tudo em letra maiúscula
        s = s.replace("X","senhora");  // substituir o X pela senhora
        System.out.println(s);
        s= s.concat("!!!");
        System.out.println(s);
        System.out.println("leo".toUpperCase()); //mesmo sem ter armazenado em nenhuma variável ele me deu o LEO maiusculo
        String y= "Bom dia x".replace("x", "gui".toUpperCase().concat("!!!"));
        System.out.println(y);
    }
}
