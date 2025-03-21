package classes;

public class DataTeste {
    public static void main(String[] args) {

        Data data = new Data(11, 8, 2002);

        var dataPadrao = new Data();


        System.out.println("Você nasceu no dia: " + data.dataFormatada());

        System.out.println("Você nasceu no dia: " + dataPadrao.dataFormatada());
    }
}
