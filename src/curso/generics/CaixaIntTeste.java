package curso.generics;

public class CaixaIntTeste {
    public static void main(String[] args) {

        CaixaInt<String> caixaA = new CaixaInt<>();
        caixaA.guardar("bola");
        String coisa = caixaA.abrir();
        System.out.println(coisa);


    }
}
