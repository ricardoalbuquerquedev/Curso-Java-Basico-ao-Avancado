package Classe;

public class AreaCirc {
    double raio;      // minha class terá dois atributos
    final static double PI= 3.14;
    // então aqui eu vou criar um construtor
    AreaCirc(double raioInicial){
       raio = raioInicial;
    }
    // e vou criar um método q vai calcular a area da circ.
    double area(){
        return  PI* Math.pow(raio, 2);
    }

}
