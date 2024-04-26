package curso.projetos;
import javax.swing.JOptionPane;
public class LerComprimento {
    public double lerComprimento() {
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o comprimento"));
        return comprimento;
    }

    public double getDiametro(double comprimento) {
        double diametro = comprimento / 3.14;
        return diametro;
    }

    public double getRaio(double diametro) {
        double raio = diametro / 2;
        return raio;
    }

    public double getArea(double raio) {
        double area = raio * raio * 3.14;
        return area;
    }

    public void plotar(double comprimento, double diametro, double raio, double area) {
        JOptionPane.showMessageDialog(null, String.format(" Comprimento: %.2f\n Diâmetro: %.1f\n Raio: %.1f\n Área: %.1f", comprimento, diametro, raio, area));
    }

    public void controle() {
        String menu = "---- Menu ----\n";
        menu += " 1 Ler \n 2 Sair";
        double comprimento=0, diametro=0, raio=0, area=0;
        int itemMenu = 0;

        while (true) {
            itemMenu = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (itemMenu) {
                case 1:
                    comprimento = lerComprimento();
                    diametro = getDiametro(comprimento);
                    raio = getRaio(diametro);
                    area = getArea(raio);
                    plotar(comprimento, diametro, raio, area);
                    break;
                case 2:
                    System.exit(0);
            }
        }

    }
    public static void main(String[] args) {
        LerComprimento ado = new LerComprimento();
        ado.controle();
    }
}


