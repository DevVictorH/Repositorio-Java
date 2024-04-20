package curso.projetos;
import javax.swing.JOptionPane;
public class ProgramaTriangulo {
    public static void main(String[] args) {
        String tipo;
        double a=0, b=0, c=0, sp=0, itemMenu=0;

        do {
            itemMenu = Double.parseDouble(JOptionPane.showInputDialog(null, "-- MENU -- \n 1 Executar \n 2 Finalizar"));
            if(itemMenu == 1) {
                a= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do lado A"));
                b= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do lado B"));
                c= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do lado C"));
            if(a >= b+c || b >= a+c || c >= a+b || a <= 0 || b <+ 0 || c <= 0) {
                JOptionPane.showMessageDialog(null, "Error!, lados inválidos!");
            } else if(a == b && b ==c) {
                sp = (a+b+c)/2;
                tipo = "Equilátero";
                JOptionPane.showMessageDialog(null, sp + " " + tipo);
            } else if(a != b && a != c && b != c) {
                sp = (a+b+c)/2;
                tipo = "Escaleno";
                JOptionPane.showMessageDialog(null, sp + " " + tipo);
            } else {tipo = "Isosceles"; JOptionPane.showMessageDialog(null, sp + " " + tipo);}

            } else if (itemMenu == 2) {
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                System.exit(0);
            } else {JOptionPane.showMessageDialog(null, "Opção inválida.");}

        } while (true);

    }
}
