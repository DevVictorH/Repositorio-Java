package curso.generics;

import java.util.*;

public class Pares<C extends Number, V> {

    private final Set<Par<C, V>> itens = new HashSet<>();

    public void adicionar(C chave, V valor){
        Par<C, V> novoPar = new Par<C, V>(chave, valor);
        if(chave != null) {
            if(itens.contains(novoPar)){
                itens.remove(novoPar);
            }
            itens.add(novoPar);
        }
    }

    public V getValor(C chave){
        if(chave == null) return null;
        Optional<Par<C, V>> parOptional = itens.stream().filter(par -> chave.equals(par.getChave())).findFirst();

        return parOptional.isPresent() ? parOptional.get().getValor() : null;
    }
}
