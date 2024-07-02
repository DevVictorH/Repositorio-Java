package curso.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimirNome = produto -> System.out.println(produto.nome);

        Produto p1 = new Produto("rexona", 123, 0);
        Produto p2 = new Produto("camisa", 63, 0);
        Produto p3 = new Produto("borracha", 36, 0);
        Produto p4 = new Produto("bolacha", 523, 0);
        Produto p5 = new Produto("tesoura", 23, 0);


        imprimirNome.accept(p1);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);

    }
}
