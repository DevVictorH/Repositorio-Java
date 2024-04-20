package curso.classe;

public class Equals {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Victor Hugo";
        u1.email = "victorhugo@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Victor Hugo";
        u2.email = "victorhugo@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

    }
}
