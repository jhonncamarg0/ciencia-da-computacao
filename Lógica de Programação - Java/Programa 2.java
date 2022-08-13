import javax.swing.*;
class Programa2 {
	public static void b (int vetor[]) {
		int d = 0;
		for (int i = 0; i < vetor.length; i++) {
			d = d + vetor[i];
		}
		JOptionPane.showMessageDialog(null, "Somatoria do vetor: " + d);
	}

	public static int c (int vetor[]) {
		int j = 1;
		for (int i = 0; i < vetor.length; i++) {
			j = j * vetor[i];
		}
		return j;
	}
	public static void main (String entrada[]) {
		int vetor[];
		vetor = new int[5];
		int f;
		String g = "";
		String h = "";
		g = "Criacao de Aplicacoes e Sistemas - Algoritmo 16";
		JOptionPane.showMessageDialog(null, g);
		for (int i = 0; i < vetor.length; i++) {
			int x = 0;
			int y = i + 1;
			x = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero " + y + " do vetor: "));
			vetor[i] = vetor[i] + x;
		}
		b(vetor);
		f = c(vetor);
		JOptionPane.showMessageDialog(null, "Produtoria do vetor: " + f);
		h = "Obrigado por ter usado o algoritmo!";
		JOptionPane.showMessageDialog(null, h);
		System.exit(0);
	}
}