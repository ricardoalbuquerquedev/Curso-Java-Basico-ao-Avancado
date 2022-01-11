package ooHeranca;

public class Jogador {
   int vida = 100;
    int x; // comeca pelo zero msm 0.0
    int y;// comeca pelo zero msm 0.0
    // vou calcular a diferença no x
    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);  // quero valor absoluto
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10; // atribuicao substrativa
            return true;

        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }
    }
    boolean andar( Direcao direcao){
        switch (direcao){
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;

    }

}
