package curso.controle;

public class Switch {
    public static void main(String[] args) {

        //  Quando não tem o Break, se ele entrar no primeiro case
        //  Ele vai executar todos os outros case

        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
        }
        System.out.println();
        int idade = 3;
        switch (idade) {
            case 3:
                System.out.println("Sabe falar");
            case 2:
                System.out.println("Sabe andar");
            case 1:
                System.out.println("Sabe respirar");
        }



    }
}
