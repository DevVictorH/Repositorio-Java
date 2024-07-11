package curso.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Victor", "Pedro", "João", "Igor");

        // usando For
        for(int i =0; i < aprovados.size(); i++){
            System.out.println(aprovados.get(i));
        }
        System.out.println();

        // usando ForEach
        for(String nome: aprovados){
            System.out.println(nome);
        }
        System.out.println();

        // usando Iterator
        Iterator<String> iterador = aprovados.iterator();
        while(iterador.hasNext()) {
            System.out.println(iterador.next());
        }
        System.out.println();

        // usando Stream
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);

    }
}
