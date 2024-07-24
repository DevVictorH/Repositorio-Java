package curso.generics;

public class ParesTeste {
    public static void main(String[] args) {

        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "João");
        resultadoConcurso.adicionar(3, "Victor");
        resultadoConcurso.adicionar(4, "Pedro");
        resultadoConcurso.adicionar(2, "Luiz");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(4));
        System.out.println(resultadoConcurso.getValor(2));

    }
}
