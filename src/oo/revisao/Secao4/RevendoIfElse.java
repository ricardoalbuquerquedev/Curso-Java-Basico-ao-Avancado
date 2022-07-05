package oo.revisao.Secao4;

import javax.swing.*;

public class RevendoIfElse {
    public static void main(String[] args) {
       String valor = JOptionPane.showInputDialog("Digite um numero");
       double numero = Double.parseDouble(valor);
       if(numero>= 7.0){
           System.out.println("Ótimo");
       }else{
           System.out.println("Numero baixo");
       }


    }
}
