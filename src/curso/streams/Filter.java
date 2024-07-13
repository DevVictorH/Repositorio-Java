package curso.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Victor", 9.1);
        Aluno a2 = new Aluno("Igor", 9.4);
        Aluno a3 = new Aluno("Gabriel", 10.0);
        Aluno a4 = new Aluno("Enzo", 6.8);
        Aluno a5 = new Aluno("Julia", 5.5);
        Aluno a6 = new Aluno("Pedro", 8.2);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> msg = m -> "Parabéns " +m.nome+ " você foi aprovado!";

        alunos.stream()
                .filter(aprovado)
                .map(msg)
                .forEach(System.out::println);


    }
}
