package curso.poo.heranca.desafio;

public class Porsche extends Carro{


    public Porsche(){
        this(300);
    }
    Porsche(int velocidadeMaxima){
        super(velocidadeMaxima);
    }
    boolean acelerar1 = super.andar(Acao.ACELERAR);
    boolean acelerar2 = super.andar(Acao.ACELERAR);

}
