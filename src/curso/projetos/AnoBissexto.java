package curso.projetos;
import javax.swing.JOptionPane;
public class AnoBissexto {
    public static void main(String[] args) {

        String saida;
        int tecla;
        int ano;
        String menu = "\n -- Menu --";
        menu += "\n 1 Executar \n 2 Sair";

        while (true) {
            tecla = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (tecla) {
                case 1:
                    ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um ano:"));
                    int mr = ano % 4;
                    if (mr == 0) {
                        saida = "O ano é bissexto";
                        JOptionPane.showMessageDialog(null, saida);
                    } else {
                        saida = "O ano não é bissexto";
                        JOptionPane.showMessageDialog(null, saida);
                    } break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Programa Finalizado!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error!");
            }
        }





    }
}
