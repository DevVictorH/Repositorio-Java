package curso.lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo soma = (x, y) -> {
            return x+y;
        };

        System.out.println(soma.executar(2, 3));

        soma = (x, y) -> x * y; // quando não usa o par de chaves, o return ficará implicito.
        System.out.println(soma.executar(2, 3));

    }
}
