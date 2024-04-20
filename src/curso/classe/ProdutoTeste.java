package curso.classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4359.89;
        Produto.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 12.50;


        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();

        System.out.printf("%.2f\n",precoFinal1);
        System.out.printf("%.2f\n",precoFinal2);
        System.out.println(p2.nome);

    }
}
