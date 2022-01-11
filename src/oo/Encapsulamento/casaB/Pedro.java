package oo.Encapsulamento.casaB;

import oo.Encapsulamento.CasaA.Ana;

public class Pedro extends Ana {
    void testeAcessos(){

        //System.out.println(segredo); //é privado eu n vou conseguir acessar
        //System.out.println(facoDentroDeCasa); //só quem ta no msm pacote ver
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);


    }
}

