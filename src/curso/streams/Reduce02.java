package curso.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce02 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Luiz", 8.1);
        Aluno a2 = new Aluno("Rafael", 7.1);
        Aluno a3 = new Aluno("Mariana", 3.6);
        Aluno a4 = new Aluno("Leticia", 5.0);
        Aluno a5 = new Aluno("Pedro", 9.2);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> getNota = n -> n.nota;
        BinaryOperator<Double> soma = (a, b) -> a + b;

        alunos.stream()
                .filter(aprovado)
                .map(getNota)
                .reduce(soma)
                .ifPresent(System.out::println);



    }
}
