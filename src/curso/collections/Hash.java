package curso.collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Victor"));
        usuarios.add(new Usuario("Luiz"));

        System.out.println(usuarios.contains(new Usuario("Pedro")));
        

    }
}
