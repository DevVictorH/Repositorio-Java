package curso.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        // .put - adiociona ou substitui o valor
        usuarios.put(1, "Victor");
        usuarios.put(2, "Kauan");
        usuarios.put(3, "João");

        System.out.println(usuarios.size()); // mostra o tamanho do map
        System.out.println(usuarios.isEmpty()); // mostra se esta vazio

        System.out.println(usuarios.keySet()); // serve para ver os numeros
        System.out.println(usuarios.values()); // serve para ver os valores escritos
        System.out.println(usuarios.entrySet()); // serve para ver os numeros e os valores escritos
        System.out.println(usuarios.get(2));
        System.out.println(usuarios.remove(1));

        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for (String valor: usuarios.values()){
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.println(registro);
        }

    }
}
