package br.com.exercicio;

import javax.swing.JOptionPane;

public class Ex08 {

	/*
	 * 
	 * Faça um programa que leia 5 números e informe a soma e a média dos números.
	 * 
	 */
	public static void main(String[] args) {

		int cont = 1;
		int numero;
		int soma = 0;
		double media=0;

		while (cont <= 5) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digiti um numero: "));

			soma = soma + numero;
			media = soma/cont;

			cont++;
		}
		System.out.println("A soma dos numeros dão : "+soma);
		System.out.println("A medi dos numeros dão : "+media);

	}

}
