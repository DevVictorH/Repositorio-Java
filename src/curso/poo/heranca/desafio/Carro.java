package curso.poo.heranca.desafio;

import curso.poo.heranca.Direcao;

public class Carro {

    int velocidade = 0;
    final int VELOCIDADE_MAXIMA;
    private int delta = 5;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public boolean andar(Acao acelerar) {
        switch (acelerar) {
            case ACELERAR:
                if(velocidade + getDelta() > VELOCIDADE_MAXIMA){
                    velocidade = VELOCIDADE_MAXIMA;
                } else {
                velocidade += getDelta();
                }
                break;

            case FREIAR:
                if(velocidade >= 5) {
                    velocidade -= 5;
                    break;
                } else {
                    velocidade = 0;
                }
        }
        return true;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
