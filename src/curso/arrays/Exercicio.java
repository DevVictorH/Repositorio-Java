package curso.arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAluno1 = new double[3];

        notasAluno1[0] = 7.5;
        notasAluno1[1] = 8;
        notasAluno1[2] = 9.3;

        System.out.println(Arrays.toString(notasAluno1));

        double total = 0;
        for(int i =0; i < notasAluno1.length; i++){
            total += notasAluno1[i];
        }
        System.out.println(total / notasAluno1.length);

        double totalAlunoB = 0;
        double[] notasAlunoB = {6.7, 5.6, 2.4, 9};
        for (int i =0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println(totalAlunoB / notasAlunoB.length);


    }
}
