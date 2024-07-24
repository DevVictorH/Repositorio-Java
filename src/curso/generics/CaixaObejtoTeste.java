package curso.generics;

public class CaixaObejtoTeste {
    public static void main(String[] args) {

        CaixaObjeto caixa1 = new CaixaObjeto();
        caixa1.guardar(2.3); // comverte um double -> para classe Double

        Double coisa = (Double) caixa1.abrir();
        System.out.println(coisa);

        CaixaObjeto caixa2 = new CaixaObjeto();
        caixa2.guardar("abc");

        String coisa2 = (String) caixa2.abrir();
        System.out.println(coisa2);
    }
}
