package curso.lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Produto p = new Produto("Celular", 2999.99, 0.05);

        Function<Produto, Double> price =
                preco -> p.preco * (1 - p.desconto); ;

        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco*1.085 : preco;

        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco+100 : preco+50;

        UnaryOperator<Double> arredondar =
                preco -> Double.
                        parseDouble(String.format("%.2f", preco));

        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(".", ",") ;


        String precoFinal = price
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preço final é " +precoFinal);
    }
}
