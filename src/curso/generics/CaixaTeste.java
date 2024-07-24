package curso.generics;

public class CaixaTeste {
    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("luva");
        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(5.1);
        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);


    }
}
