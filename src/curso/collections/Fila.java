package curso.collections;
import java.util.LinkedList;
import java.util.Queue;
public class Fila {
    public static void main(String[] args) {

    Queue<String> fila = new LinkedList<>();

    fila.add("Alvin"); // adiciona pessoas, se a fila estiver cheia retorna um erro
    fila.offer("Joao"); // adiciona pessoas, se a fila estiver cheia retorna falso
    fila.add("Victor");
    fila.add("Mario");

        System.out.println(fila.peek()); // mostra o primeiro da fila, se a fila estiver vazia retorna null
        System.out.println(fila.element()); // mostra o primeiro da fila,se a fila estiver vazia lança um erro

    //fila.size(); ver o tamanho da fila
    //fila.clear(); limpar a fila
    //fila.isEmpty(); mostra se esta vazio ou nao a fila
    // fila.contains(...)  saber se tem um item na fila

        System.out.println(fila.poll()); // obtem o proximo elemento da fila e remove o elemento da fila,se a fila estiver vazia retorna null
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // obtem o proximo elemento da fila e remove o elemento da fila, se a fila estiver vazia retorna um erro

    }
}
