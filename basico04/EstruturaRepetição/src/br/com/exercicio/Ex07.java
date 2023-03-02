package br.com.exercicio;

import javax.swing.JOptionPane;

public class Ex07 {

	/*
	 * 
	 * Faça um programa que leia 5 números e informe o maior número.
	 * 
	 */
	public static void main(String[] args) {

		int cont = 1;
		int numero;
		int maior = 0;

		while (cont <= 5) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digiti um numero: "));

			if (numero > maior) {
				maior = numero;
			}

			cont++;
			System.out.println(maior);

		}

	}

}
