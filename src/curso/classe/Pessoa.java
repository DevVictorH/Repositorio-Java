package curso.classe;

public class Pessoa {
    String nome;
    double peso;


    Pessoa(String pessoa) {
        this.nome = pessoa;
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.pesoComida;
        }
    }

    String apresentar() {
        return "Olá eu sou o " + nome + " e tenho " + peso + "kgs.";
    }

    String apresentar2() {
        return "Agora eu tenho " + peso + "kgs.";
    }
}
