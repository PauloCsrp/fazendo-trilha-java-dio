package br.com.exercicio;

import javax.swing.JOptionPane;

public class Ex13 {
	/*
	 * Faça um programa que peça dois números, base e expoente, calcule e mostre o
	 * primeiro número elevado ao segundo número. Não utilize a função de potência
	 * da linguagem.
	 */
	public static void main(String[] args) {
 
		int base = Integer.parseInt( JOptionPane.showInputDialog("O numero da base:"));
		int expoente = Integer.parseInt( JOptionPane.showInputDialog("O numero da expoente:"));
		
		int i;
		int resultado = 1;
		
		for(i=1;  i<=expoente; i++) {
			resultado*= base;
			
			  System.out.println(resultado);
		}

	}

}
