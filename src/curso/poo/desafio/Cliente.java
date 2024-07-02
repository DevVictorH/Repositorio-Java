package curso.poo.desafio;

import java.util.ArrayList;

public class Cliente {

    final String nome;
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Compra> compras = new ArrayList<>();


    Cliente(String nome){
        this.nome = nome;
    }

    void getCompra(Compra compra){
        this.compras.add(compra);
    }

   double getValorTotal(){
       double total = 0;

       for(Compra compraAtual: compras){
           total += compraAtual.getValorTotal();
       }
       return total;
    }



}
