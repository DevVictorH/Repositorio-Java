package curso.lambdas;

public class CalculoTeste {
    public static void main(String[] args) {

        Calculo soma = new Somar();
        System.out.println(soma.executar(2, 3));

        Calculo mult = new Multiplicar();
        System.out.println(mult.executar(2, 3));



    }
}
