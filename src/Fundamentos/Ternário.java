package Fundamentos;

public class Ternário {
    public static void main(String[] args) {
        double media = 8.6;
        String resultadoFinal = media >=7.0 ?"aprovado": "em recuperação";
        System.out.println("O aluno está" + resultadoFinal);

        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >=7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "sim" : "não";
        System.out.println("Tem desconto?" + resultado );
        // aqui eu tbm podia usar o printf
        System.out.printf("Tem desconto? %s" , resultado);

    }
}
