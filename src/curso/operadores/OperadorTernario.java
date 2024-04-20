package curso.operadores;

public class OperadorTernario {
    public static void main(String[] args) {

        // Operador Ternario
        // ? - caso a expressao for verdadeira
        // : - se não

        double media = 3.5;
        String resultadoParcial = media >= 4 ? "Recuperação" : "Reprovado";
        String resultado = media >= 7.0 ? "Aprovado" : resultadoParcial;

        System.out.println(resultado);


    }
}
