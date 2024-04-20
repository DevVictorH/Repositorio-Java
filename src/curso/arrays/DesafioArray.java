package curso.arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valorNota;
        int notas;


        System.out.println("Quantas notas você deseja informar?");
        notas = ler.nextInt();
        double[] qtd = new double[notas];

        for (int i = 0; i < qtd.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            qtd[i] = ler.nextDouble();

        }
        double total = 0;
        for (double nota : qtd) {
            total += nota;
        }
        double soma = total / qtd.length;
        System.out.println(String.format("A média é %.1f", soma));


    }
}
