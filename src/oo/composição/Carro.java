package oo.composição;
// RELAÇÃO UM P UM CARRO PARA MOTOR
public class Carro {
    Motor motor = new Motor(); // Atributo de instância se eu colocar static fica atributo de class
    void acelerar (){
        if (motor.fatorInjecao < 2.6) {// criei um método
            motor.fatorInjecao += 0.4;
        }

    }
    void frear() {
        if (motor.fatorInjecao> 0.5) {// mecanismo de defesa
            motor.fatorInjecao -= 0.4;
        }

    }
    void ligar (){
        motor.ligado = true;
    }
    void desligar(){
        motor.ligado = false;
    }
    boolean estaLigado (){
        return motor.ligado;
    }


    }

