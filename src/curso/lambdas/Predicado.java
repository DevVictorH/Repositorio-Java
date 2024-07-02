package curso.lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {

        Predicate<Produto> isCaro = prod -> prod.preco >= 750;

        Produto produto = new Produto("lapis", 23, 0.10);
        System.out.println(isCaro.test(produto));



    }
}
