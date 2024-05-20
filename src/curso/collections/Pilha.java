package curso.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("Harry Potter");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek()); // mostra o topo da pilha
        System.out.println(livros.element()+"\n"); // mostra o topo da pilha

        System.out.println(livros.pop()); // metodo para remover
        System.out.println(livros.poll()); // metodo para remover
        System.out.println(livros.remove()); // metodo para remover

        //livros.size();
        //livros.clear();
        //livros.contains();
        

    }
}
