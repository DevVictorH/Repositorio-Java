package curso.excecao.personalizadaB.personalizadaA;

import curso.excecao.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {

        try {
            Aluno aluno1 = new Aluno("", -10);
            Validar.aluno(aluno1);
        } catch (StringVaziaException | NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim");

    }
}
