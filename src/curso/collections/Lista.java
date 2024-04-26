package curso.collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Victor");
        lista.add(u1);
        lista.add(new Usuario("Joao"));
        lista.add(new Usuario("Vinicius"));
        lista.add(new Usuario("Mario"));

        System.out.println(lista.toString());
        lista.remove(1);
        System.out.println(lista.contains("Joao"));

        for(Usuario u: lista) {
            System.out.println(u.nome);
        }

    }

}
