package curso.arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

    System.out.println("Quantos alunos?");
        int qtdeAlunos = ler.nextInt();

        System.out.println("Quantas notas por aluno?");
        int qtdeNotas = ler.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
        double notaTotal =0;

        for(int aluno =0;aluno < notasDaTurma.length; aluno++){
            for(int nota =0; nota < notasDaTurma[aluno].length; nota++){
                System.out.printf("Informe a nota %d do aluno %d: ", nota + 1, aluno + 1);
                notasDaTurma[aluno][nota] = ler.nextDouble();
                notaTotal += notasDaTurma[aluno][nota];
            }

        }
        double media = notaTotal / (qtdeAlunos*qtdeNotas);
        System.out.println("A media da turma é " +media);

    }
}
