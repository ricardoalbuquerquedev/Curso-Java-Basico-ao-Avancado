package Fundamentoss;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionário

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        //Tipos numéricos(reais) com ponto flutuante
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;
        // Temos acima os seis tipos de primitivos 4 inteiros e 2 flutuantes

        // Tipo Boleano
        boolean estaDeFerias = false; // ou true (é só o que o Java permite
        // Tipo Caractere

        // Dias de empresa
        System.out.println( anosDeEmpresa * 365);
        // numero de Viagens
        System.out.println(numeroDeVoos / 2);
        // Pontos por real
        System.out.println( pontosAcumulados/vendasAcumuladas);
        System.out.println(id + "ganha" + salario);
        System.out.println("Ferias" + estaDeFerias);







    }
}
