import javax.swing.*;
class Programa1 {
    public static void main (String entrada[]) {
        int a, b, c = 1;
        char d = 0;
        String f = "";
        String g = "";
        String h = "";
        f = "Criacao de Aplicacoes e Sistemas - Algoritmo 15";
        JOptionPane.showMessageDialog(null, f);
        a = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero: "));
        d = (JOptionPane.showInputDialog("Insira uma opcao:\n\n(1) Produto\n(2) Produtoria\n")).charAt(0);
        switch(d) {
            case '1': {
                if (a > 0 && b > 0) {
                    c = a * b;
                    g = g + "Produto do numero " + a + " pelo numero " + b + ": " + c;

                }
                break;
            }
            case '2': {
                for(int i = 1; i <= b; i = i+1) {
                    c = c * a;
                }
                g = g + "Produtoria do numero " + a + " (" + b + ") vezes: " + c;
                break;
            }
            default: JOptionPane.showMessageDialog(null, "Opcao invalida!\n\nObs. Insira apenas a opcao 1 ou 2");
        }
        if (d >= '1' && d <= '2') {
            JOptionPane.showMessageDialog(null, g);
        }
        h = "Obrigado por ter usado o algoritmo!";
        JOptionPane.showMessageDialog(null, h);
        System.exit(0);
    }
}