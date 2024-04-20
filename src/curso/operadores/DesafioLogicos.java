package curso.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {

        boolean traTer = false;
        boolean traQui = true;

        if (traTer && traQui) {
            System.out.println("Vou comprar uma tv de 50 polegadas e tomar sorvete.");
        } else if (traTer || traQui) {
            System.out.println("Vou comprar uma tv de 32 polegadas e tomar sorvete.");
        } else {
            System.out.println("Vamos ficar em casa");
        }





    }
}
