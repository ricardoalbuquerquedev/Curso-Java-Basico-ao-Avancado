package oo.revisao.Secao5;

public class RefazendoClasseProdutoTeste {
    public static void main(String[] args) {
        RefazendoClasseProduto produto1 = new RefazendoClasseProduto("mouse",85.90);

        var produto2 = new RefazendoClasseProduto();
        produto2.nome = "teclado";
        produto2.preco = 133.85;
        RefazendoClasseProduto.desconto = 0.50;   // aqui eu acessei o desconto diretamente
        // da classe pq o desconto pertence à classe, ele é static.


        System.out.println(produto1.nome + ""+ produto1.precoComDesconto());  // qdo chamo sem () to chamando atributo
        System.out.println(produto2.nome + ""+ produto2.precoComDesconto());

        double precoFinal1 = produto1.precoComDesconto();  // qdo chamo com () to chamando método
        double precoFinal2 = produto2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1+ precoFinal2);
        System.out.printf("Média do carrinho é = R$%.2f ",mediaCarrinho);

        // no System.out.println(); (System é classe, out atributo e println() é o método)

    }



}
