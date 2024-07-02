package curso.poo.composicao;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Victor");
        Aluno aluno3 = new Aluno("Gabriel");

        Curso curso1 =  new Curso("Java Completo");
        Curso curso2 =  new Curso("Python");
        Curso curso3 =  new Curso("Web 2024");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno3);
        curso2.adicionarAluno(aluno1);

        aluno1.adcionarCurso(curso3);
        aluno2.adcionarCurso(curso2);

        for(Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado no curso" + curso1.nome);
            System.out.println("Meu nome é " + aluno.nome);
        }

        Curso cursoEncontrado = aluno1.getCurso("Java Completo");
        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }

    }
}
