package curso.fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "CALCULADORA");
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Escreva um número"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro número"));
        String operacao = JOptionPane.showInputDialog(null, "Escolha a operação");


        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;

        JOptionPane.showMessageDialog(null,"O resultado é " +resultado);

        System.exit(0);


    }
}
