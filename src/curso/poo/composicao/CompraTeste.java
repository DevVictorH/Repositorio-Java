package curso.poo.composicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "Joao";
        c1.adicionarItem("Caneta", 20, 7.50);
        c1.adicionarItem(new Item("Borracha", 4, 2.00));
        c1.adicionarItem(new Item("Caderno", 8, 24.79));

        System.out.println(c1.itens.size());
        System.out.println("R$"+c1.getValorTotal());


    }

}
