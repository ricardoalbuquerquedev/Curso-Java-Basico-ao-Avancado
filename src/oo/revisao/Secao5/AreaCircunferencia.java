package oo.revisao.Secao5;

public class AreaCircunferencia {
    double raio;
     static double PI= 3.14;  // c/ o static o valor de pi tah diretamente associado à Class e n às instancias
    AreaCircunferencia (double raioInicial){  // meu construtor com parametro
        raio = raioInicial;
    }
    double area (){        // meu método
        return PI*Math.pow(raio,2);

    }


    }

