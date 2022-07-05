package voltandoAoComeco.Secao5;

public class Gente {

    String nome = "Gigi";
    double peso = 50.9;

    Gente (String nome, double peso){    // construtor
        this.nome= nome;
        this.peso = peso;
    }
    void comer (Ccomida comida){
        if(comida !=null){
            this.peso = this.peso+comida.pesoComida;
        }
        }
    String apresentar(){
        return "Olá eu sou a" + nome + "e tenho"+ peso +"Kg.";
    }

    }

