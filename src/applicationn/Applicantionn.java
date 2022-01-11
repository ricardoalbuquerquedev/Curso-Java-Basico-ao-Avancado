package applicationn;

import modell.Produto;
import modell.Venda;

public class Applicantionn {
    public static void main(String[] args){
        double desconto = ((double) 30/100);
        double subtotal;
        Produto p1 = new Produto("Lg", "TV Plasma",2.500);
        Venda v1 = new Venda(p1,p1.getPreco(),desconto,(p1.getPreco()*desconto) );

        System.out.println("Produto: "+ v1.getProduto().getModelo());
        System.out.println(v1.getProduto().getPreco());
        System.out.println(v1.getDesconto());
        System.out.println(v1.getTotal());
        System.out.println((desconto)* p1.getPreco());



        }


    }


