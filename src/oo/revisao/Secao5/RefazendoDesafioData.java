package oo.revisao.Secao5;

public class RefazendoDesafioData {

    int dia;
    int mes;
    int ano;

    RefazendoDesafioData(){
        dia= 1;
        mes = 1;
        ano= 1970;

    }
    RefazendoDesafioData(int dia, int mes, int ano){
         this.dia = dia;
         this.mes = mes;
         this.ano = ano;

    }

    String obterDataFormatada(){    // isso é um método! tem um tipo (String) tem nome do Metodo e tem ()
        return String.format("%d %d %d", dia, mes, ano);
    }
    void imprimirDataFormatada(){     // void - não retorna nada!
        System.out.println(obterDataFormatada());
    }

}
