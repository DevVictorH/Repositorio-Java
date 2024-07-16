package curso.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Outros {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Luiz", 8.1);
        Aluno a2 = new Aluno("Rafael", 7.1);
        Aluno a3 = new Aluno("Mariana", 3.6);
        Aluno a4 = new Aluno("Leticia", 5.0);
        Aluno a5 = new Aluno("Pedro", 10.0);
        Aluno a6 = new Aluno("Victor", 7.2);
        Aluno a7 = new Aluno("Pedro", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);

        System.out.println("distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .limit(6)
                .skip(4)
                .forEach(System.out::println);

        System.out.println("\nTakeWhile");
        alunos.stream()
                .distinct()
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);

    }
}
