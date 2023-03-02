package br.com.exercicio;

import javax.swing.JOptionPane;

public class Ex05 {
	/*
	 *Altere o programa anterior permitindo ao usuário informar as populações e as
	 * taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
	 */

	public static void main(String[] args) {
		double paisA = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa da população do pais A"));
		double paisB = Double.parseDouble(JOptionPane.showInputDialog("Digite A taxa da população do pais B"));
		double cresciA = 1.03;
		double cresciB = 1.015;
	
		int ano = 0;

		do {
			paisA *=cresciA;
			paisB *=cresciB;
			
			ano ++;

		} while (paisA < paisB);
		System.out.println("Habitantes do pais A: "+ paisA);
		System.out.println("Habitantes do pais B: "+ paisB);
		System.out.println("O pais A vai demora "+ano+" anos para superar o pais B em população");
}
}