package br.com.exercicio;

import javax.swing.JOptionPane;

public class Ex11 {

	/*
	 *Altere o programa anterior para mostrar no final a soma dos números.
	 */
	public static void main(String[] args) {

		int i;
		int numero = 0;
		int soma = 0;
		double divisao = 0;

		for (i = 1; i <= 2; i++) {

			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "º numero"));
			soma = soma + numero ;
			divisao= soma/2;
		}

		System.out.println("A soma dos numeros é: " + soma);
		System.out.println("O numero entre esses dois é: " + divisao);

	}

}
