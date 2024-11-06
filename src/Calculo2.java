import java.util.Scanner;

public class Calculo2 {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        double n1 = pedirNota("Informe sua primeira nota: ");
        double n2 = pedirNota("Informe sua segunda nota: ");
        double n3 = pedirNota("Informe sua terceira nota: ");

        double media = calcularMedia(n1, n2, n3);
        String s = verificarSituacao(media);

        resultadoAluno(media, s);
    }

    public static double pedirNota(String msg){
        System.out.println(msg);
        double nota = ler.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
            System.out.println("Informe novamente a nota: ");
            nota = ler.nextDouble();
        }
        return nota;
    }

    public static double calcularMedia(double n1, double n2, double n3){

        double media = (n1 + n2 + n3) / 3;
        return media;
    }

    public static String verificarSituacao(double media){
        String situacao = "";
        if(media >= 6){
            situacao = "Aluno Aprovado!";
        } else if(media >= 2){
            situacao = "Aluno de DP";
        } else {
            situacao = "Aluno Reprovado";
        }
        return situacao;
    }

    public static void resultadoAluno(double media, String situacao){
        System.out.println(String.format("Sua média é de %.1f", media));
        System.out.println(situacao);
    }
}


