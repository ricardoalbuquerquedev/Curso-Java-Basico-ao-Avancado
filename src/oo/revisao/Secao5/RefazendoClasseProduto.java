package oo.revisao.Secao5;

public class RefazendoClasseProduto {

    String nome;
    double preco;
    static double desconto;
    RefazendoClasseProduto(){

    }

    RefazendoClasseProduto(String nomeInicial, double precoInicial){     // defini de forma explícita o construtor padrao
        nome = nomeInicial;
        preco= precoInicial;    // removi o desconto do construtor para clareza d codigo

    }

    double precoComDesconto(){    // meu método! tem o tipo (double) nome, e nenhum parâmetro
        //  porque o objeto já tem os dados de( preco e desconto)
        return preco* (1-desconto);
    }
    double precoComDesconto(double descontoDoGerente){
        return preco *(1 - desconto+ descontoDoGerente);
    }
}
