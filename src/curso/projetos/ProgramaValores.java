package curso.projetos;
import javax.swing.JOptionPane;
public class ProgramaValores {
    public static void main(String[] args) {

        String menu = "-- Menu --\n";
        menu += " 1 Ler \n 2 Resultados \n 3 Sair";
        int tecla;
        double saldo = 0, media = 0, listaValor;
        int qtdDeValores = 0;
        String nome = null;
        int contador = 0;

        while (true) {
            tecla = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (tecla) {
                case 1:
                    if (qtdDeValores == 0) {
                        nome = JOptionPane.showInputDialog("Digite seu nome:");
                    }
                    qtdDeValores = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de valores"));
                    double numero[] = new double[qtdDeValores];
                    while (contador < qtdDeValores) {
                        listaValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite os valores da lista:"));
                        numero[contador] = listaValor;
                        saldo += listaValor;
                        contador++;
                    }
                    media = saldo / qtdDeValores;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, String.format("%s \n A quantidade de valores é %d \n O saldo será %.2f \n  A media é %.2f ", nome, qtdDeValores, saldo, media));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Programa Finalizado!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error!");
            }
        }


    }
}
