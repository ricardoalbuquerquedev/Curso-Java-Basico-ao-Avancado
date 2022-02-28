package Classe;

public class Produto {
    String nome; // atributo / variáveis
    double preco; // atributo /variáveis
   static double desconto= 0.25; // atributo/ variáveis


    //String e double acima são o tipo


   // seção 91
    double precoComDesconto() { // não preciso colocar parâmetros pq meu objeto já tem parâm.
        // por isso nao preciso receber de fora
        return preco * (1 - desconto);
    }

}
