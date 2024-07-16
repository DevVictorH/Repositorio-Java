package curso.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {

        Carro c1 = new Carro("Onix", 68.000, true);
        Carro c2 = new Carro("HB20", 60.245, true);
        Carro c3 = new Carro("Duster", 79.924, false);
        Carro c4 = new Carro("Blazer", 110.560, true);
        Carro c5 = new Carro("Golf", 122.510, false);
        Carro c6 = new Carro("Gol", 33.120, true);
        Carro c7 = new Carro("Palio", 29.070, false);

        List<Carro> carros = Arrays.asList(c1,c2,c3,c4,c5,c6,c7);
        Predicate<Carro> valor = p -> p.preco >= 30.000;
        Predicate<Carro> foiVendido = v -> v.vendido;
        Function<Carro, String> msg = m -> m.nome + " foi vendido, parabéns!";

        carros.stream()
                .filter(valor)
                .filter(foiVendido)
                .map(msg)
                .forEach(System.out::println);



    }
}
