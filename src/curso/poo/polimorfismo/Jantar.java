package curso.poo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(60.2);

        Arroz ingrediente1 = new Arroz(0.25);
        Feijao ingrediente2 = new Feijao(0.18);
        Sorvete sobremesa = new Sorvete(0.5);

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(sobremesa);

        System.out.println(convidado);

    }
}
