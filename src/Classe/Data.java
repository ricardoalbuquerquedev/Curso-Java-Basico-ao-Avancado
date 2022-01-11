package Classe;

public class Data {
    int dia;
    int mes;
    int ano;
    // capitulo 97 - construtor
    Data (){
        dia = 1;
        mes = 1;
        ano= 1970;

    }
    Data (int dia, int mes, int ano){
        this.dia  = dia;
        this.mes =mes ;
        this.ano =ano ;


    }
    // capitulo 93
    String obterDataFormatada(){

        final String formato = "%d %d %d";
        return String.format(formato,this.dia,mes,ano);
    }
}
