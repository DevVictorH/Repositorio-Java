package curso.poo.desafio;

import java.util.ArrayList;

public class Compra {

    final ArrayList<Item> itens = new ArrayList<>();

    void getItem(Produto p, int quantidade){
        this.itens.add(new Item(p, quantidade));
    }

    void getItem(String nome, double preco, int quantidade){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quantidade));
    }

    double getValorTotal(){
        double total = 0;

        for(Item item: itens){
            total += item.quantidade * item.produto.preco;
        }

        return  total;
    }

}
