package curso.collections;

import java.util.Objects;

public class Usuario {

    String nome;


    Usuario(String nome){
        this.nome = nome;
    }

    public String toString(){
        return "Meu nome é " +this.nome;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }


    public int hashCode() {

        return Objects.hash(nome);
    }
}
