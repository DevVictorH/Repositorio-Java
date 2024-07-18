package curso.excecao;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println(7 / ler.nextInt());
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally...");
            ler.close();
        }

        System.out.println("Fim!");

    }
}
