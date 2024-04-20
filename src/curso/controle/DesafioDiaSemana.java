package curso.controle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o numero do dia da semana:");
        int dia = ler.nextInt();

        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda");
        } else if (dia == 3) {
            System.out.println("Terça");
        } else if (dia == 4) {
            System.out.println("Quarta");
        } else if (dia == 5) {
            System.out.println("Quinta");
        } else if (dia == 6) {
            System.out.println("Sexta");
        } else if (dia == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Error!");
        }


    }
}
