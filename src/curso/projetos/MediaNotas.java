package curso.projetos;

import javax.swing.JOptionPane;
public class MediaNotas {
    public static void menu() {

        double n1, n2, f, mg;
        char tecla;
        String strlItem, saida;
        String menu = "-- Menu de Controle --";
        menu += "\n 1 Executar \n 2 Sair";

        do {
            strlItem = JOptionPane.showInputDialog(null, menu);
            tecla = strlItem.charAt(0);

            switch (tecla) {
                case '1':
                    n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 1:"));
                    n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 2:"));
                    f = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o numero de faltas:"));
                    mg = Math.sqrt(n1 * n2);

                    while(n1 < 0 || n2 < 0 || n1 > 10 || n2 > 10) {
                        JOptionPane.showMessageDialog(null, "Nota inválida, digite novamente");
                        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 1:"));
                        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 2:"));
                        f = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o numero de faltas:"));
                        mg = Math.sqrt(n1 * n2);
                    }

                    if (n1 < 6 || f > 20) {
                        saida = String.format("Media: %.2f, Reprovado.", mg);
                    } else {
                        saida = String.format("Media: %.2f, Aprovado.", mg);
                    }
                    JOptionPane.showMessageDialog(null, saida);
                    break;

                case '2':
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida.");
            }

        } while(true); } public static void main (String[] args) {menu();}}
