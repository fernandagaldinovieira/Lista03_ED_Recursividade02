package view;

import controller.ApareceNumeroController;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		ApareceNumeroController qtdAparece = new ApareceNumeroController();
		int n1 = 0;
		while (n1 < 10 || n1 > 999999) {
			n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 10 e 999999: "));
		}
		
		int n2 = -1;
		while (n2 <0 || n2 > 9) {
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 9: "));
		}

		int resultado = qtdAparece.ApareceNumero(n1, n2);
		System.out.println("O número " + n2 + " aparece " + resultado + " vez(es) no número " + n1);
	}
}
