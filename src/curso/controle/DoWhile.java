package curso.controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String texto = "";

        do {
            System.out.println("Voce precisa falar as palavras magicas");
            System.out.println("Quer sair?");
            texto = ler.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));
        // se for diferente de por favor ele vai continuar perguntando
        // ao usuario

        System.out.println("Obrigado!");

    }
}
