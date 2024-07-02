package curso.poo.desafio;

public class ClienteTeste {
    public static void main(String[] args) {

    Cliente c1 = new Cliente("Victor");
    Cliente c2 = new Cliente("João");


    Compra compra1 = new Compra();
    compra1.getItem("Caneta", 4.52, 5);
    compra1.getItem("Pc", 3520.12 ,1);

    c1.getCompra(compra1);
    c1.compras.add(compra1);

    System.out.println(c1.getValorTotal());

    }
}
