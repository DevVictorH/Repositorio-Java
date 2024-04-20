package curso.classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data(2, 4, 2024);
        //d1.dia = 26;
        //d1.mes = 4;
        //d1.ano = 2006;

        Data d2 = new Data();
        d2.dia = 12;
        d2.mes = 3;
        d2.ano = 2006;

        Data d3 = new Data();

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        System.out.println(d3.obterDataFormatada());
    }
}
