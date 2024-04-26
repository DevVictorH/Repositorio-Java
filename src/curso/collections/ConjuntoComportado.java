package curso.collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
    public static void main(String[] args) {

        Set<String> lista = new HashSet<>(); // em vez de HashSet pode usar o TreeSet() para garantir a ordem do conjunto

        lista.add("azul");
        lista.add("vermelho");
        lista.add("verde");
        lista.add("amarelo");


        for(String cores: lista){
            System.out.println(cores);

        }
        Set<Integer> nums = new HashSet<>();

        nums.add(8);
        nums.add(1);
        nums.add(7);
        nums.add(5);

    }
}
