package oo.composição;

public class Motor {
    boolean ligado = false;
    double fatorInjecao = 1; // o atributo aqui é double


    int giros() {  // o giros vai ser calculado sera o resultado d fatorInj*3000
        if (!ligado) {
            return 0;
        }else {
            return (int) Math.round(fatorInjecao * 3000);
        }

    }

}
