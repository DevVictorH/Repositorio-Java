package curso.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Luiz", 8.1);
        Aluno a2 = new Aluno("Rafael", 7.1);
        Aluno a3 = new Aluno("Mariana", 3.6);
        Aluno a4 = new Aluno("Leticia", 5.0);
        Aluno a5 = new Aluno("Pedro", 9.2);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return  1;
            if(aluno1.nota < aluno2.nota) return  -1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());

    }
}
