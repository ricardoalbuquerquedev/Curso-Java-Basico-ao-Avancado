package oo.revisao.Secao7oo.composicao;

public class Motorr {

    boolean ligado = false;
    double fatorInjecao = 1;

    int giros() {   //  <== isso é um método!
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);  // fiz um cast colocando (int) na frente.
        }
    }
}
