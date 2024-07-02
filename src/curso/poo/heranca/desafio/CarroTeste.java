package curso.poo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {

        Porsche p1 = new Porsche(200);
        Ferrari f1 = new Ferrari(300);

        f1.andar(Acao.ACELERAR);
        f1.andar(Acao.ACELERAR);
        f1.andar(Acao.ACELERAR);
        f1.andar(Acao.ACELERAR);

        f1.andar(Acao.FREIAR);
        f1.andar(Acao.FREIAR);
        f1.andar(Acao.FREIAR);
        f1.andar(Acao.FREIAR);


        f1.ligarTurbo();
        f1.ligarAr();
        f1.andar(Acao.ACELERAR);


        System.out.println("A velocidade do carro é de "+f1.velocidade+"km/h");

        p1.andar(Acao.ACELERAR);
        p1.andar(Acao.ACELERAR);


        System.out.println("A velocidade do carro é de "+p1.velocidade+"km/h");

    }
}
