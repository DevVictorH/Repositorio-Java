package curso.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Python ", "SQL\n");
        langs.forEach(print);

        String[] maisLangs = {"JavaScript ", "Kotlin ", "C#\n"};
        Stream.of(maisLangs).forEach(print);

        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Go\n");
        outrasLangs.stream().forEach(print);

    }
}
