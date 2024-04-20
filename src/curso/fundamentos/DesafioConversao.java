package curso.fundamentos;
import java.util.Locale;
import java.util.Scanner;
public class DesafioConversao {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        String salario1, salario2, salario3;
        double calcular;

        System.out.println("Digite o salario1");
        salario1 = ler.nextLine().replace(",",".");

        System.out.println("Digite o salario2");
        salario2 = ler.nextLine().replace(",",".");

        System.out.println("Digite o salario3");
        salario3 = ler.nextLine().replace(",",".");

        double sal1 = Double.parseDouble(salario1);
        double sal2 = Double.parseDouble(salario2);
        double sal3 = Double.parseDouble(salario3);

        calcular = (sal1 + sal2 +sal3) /3;

        System.out.println("A media é " +calcular);

    }
}
