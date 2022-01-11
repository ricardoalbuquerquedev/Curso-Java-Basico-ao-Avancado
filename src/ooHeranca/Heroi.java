package ooHeranca;
// herança! Aí uso a palavra reservada extends
public class Heroi extends Jogador {



    boolean atacar(Jogador oponente) {
       boolean ataque1= super.atacar(oponente); //chamei o metodo pai 2x p atacar c super
        boolean ataque2 =super.atacar(oponente);
        boolean ataque3 =super.atacar(oponente);

        return ataque1 || ataque2 || ataque3;
    }

}