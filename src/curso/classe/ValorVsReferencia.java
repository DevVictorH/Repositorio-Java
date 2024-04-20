package curso.classe;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a; // atribuição por valor (tipo primitivo)

        a++;
        b--;

        System.out.println(a + " " +b);

        Data d1 = new Data(1, 2, 1960);
        Data d2 =  d1; // atribuição por referencia (objeto)

        d1.dia = 31;
        d2.ano = 1980;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

    }
    static void voltarDataPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
}
