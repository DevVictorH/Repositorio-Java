package curso.controle;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")) {
            System.out.print("Você diz: ");
            valor = ler.nextLine();
        }





    }
}
