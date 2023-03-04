package br.com.exercicio;

import javax.swing.JOptionPane;

public class Ex12 {
	/*
	 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
	 * inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a
	 * tabuada.
	 */

	public static void main(String[] args) {
		int i;
		int multiplicacao = 0;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para a tabuada"));

		for (i = 1; i <= 10; i++) {
			multiplicacao = numero * i;
			System.out.println(numero + "x" + i + "=" + multiplicacao);

		}

	}
}
