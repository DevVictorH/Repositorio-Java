package curso.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        int a = 3+2;
        int b = a * 6;
        int c = (int) Math.pow(b, 2);
        int d = 3*2;
        int e = c / d;
        int f = 1-5;
        int g = 2-7;
        int h = f * g;
        int i = h / 2;
        int j = (int) Math.pow(i, 2);
        int k = e - j;
        int l = (int) Math.pow(k, 3) / (int)Math.pow(10, 3);
        int resultado = l;

        System.out.println("O resultado é " +resultado);
    }
}
