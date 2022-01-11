package Classe.Desafio3Classes;

import Classe.Desafio3Classes.Comida;

public class Pessoa {
    String nome;
    double peso;
    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
       void comer (Comida comida){
        if (comida!=null){
            this.peso= this.peso +comida.peso; // quando coloco assim falo que este peso agora é peso +comida
        }
}
     String apresentar(){ // toString funcao imprimir os atributos do objeto
        return "Olá eu sou o \n"+ nome +" e tenho\n" + peso + "kg";
     }


    @Override
    public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' +", peso=" + peso +
                '}';
    }
}
