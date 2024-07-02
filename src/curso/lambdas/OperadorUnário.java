package curso.lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnário {
    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = num -> num+2;
        UnaryOperator<Integer> vezesDois = num -> num*2;
        UnaryOperator<Integer> aoQuadradoDois = num -> num*num;

        int resultado1 = maisDois.andThen(vezesDois)
                .andThen(aoQuadradoDois).apply(0);

        System.out.println(resultado1);

        // vai rodar ao contrario
        int resultado2 = aoQuadradoDois.compose(vezesDois)
                .compose(maisDois).apply(0);

    }
}
