package br.com.exercicio;

import javax.swing.JOptionPane;

public class Ex01 {
//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o 
//valor seja inválido e continue pedindo até que o usuário informe um valor válido.

	public static void main(String[] args) {

		int numero;
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 0 e 10 "));
		} while (numero < 0 || numero > 10);
		JOptionPane.showMessageDialog(null, "Seu numero foi registrador!");
		System.out.println(numero);
	}

}
