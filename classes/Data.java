package classes;

public class Data {
    int dia;
    int mes;
    int ano;

    Data (){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }
    Data(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String dataFormatada(){
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
