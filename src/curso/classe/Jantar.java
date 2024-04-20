package curso.classe;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Macarrão", 0.300);
        Comida c2 = new Comida("Lasanha", 0.400);

        Pessoa p1 = new Pessoa("Pedro");
        p1.peso = 60;
        Pessoa p2 = new Pessoa("Victor");
        p2.peso = 80;
        System.out.println(p1.apresentar());
        System.out.println(p2.apresentar());
        p1.comer(c1);
        p2.comer(c2);

        System.out.println(p1.apresentar2());
        System.out.println(p2.apresentar2());

    }
}
