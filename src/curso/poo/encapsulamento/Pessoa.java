package curso.poo.encapsulamento;

public class Pessoa {

    private int idade;
//Getter
    public int getIdade(){
        return idade;
    }
//Setter
    public void setIdade(int novaIdade) {
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

}
