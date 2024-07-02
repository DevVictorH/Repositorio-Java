package curso.poo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Jogador j1 = new Jogador();
        Heroi heroi1 = new Heroi();

        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.SUL);
        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.OESTE);
        j1.andar(Direcao.SUL);

        System.out.println(j1.y);
        System.out.println(j1.x);

        heroi1.x = 0;
        heroi1.y = 0;

        heroi1.atacar(j1);
        j1.atacar(heroi1);

        System.out.println("vida do jogador = " +j1.vida);
        System.out.println("vida do heroi = " +heroi1.vida);

    }
}
