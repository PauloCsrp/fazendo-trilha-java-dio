package br.com.exercicio;

import javax.swing.JOptionPane;

public class Ex14 {
	/*
	 * Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade
	 * de números pares e a quantidade de números impares.
	 */

	public static void main(String[] args) {
		int i;
		

		for (i = 1; i <= 10; i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "º numero"));

			if (numero % 2 == 0) {
				int contar++;
			} else if (numero % 2 != 0) {
				
			}
		}
	}
}
