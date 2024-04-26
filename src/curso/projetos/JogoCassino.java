package curso.projetos;

public class JogoCassino {
    public static void main(String[] args) {

        String[] nipes = {"♠", "♥", "♦", "♣"};
        String[] faces = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        String nipe = nipes[(int)(Math.random()*4)];
        String face = faces[(int) (Math.random()* faces.length)];

        System.out.println(face + nipe);


    }

}
