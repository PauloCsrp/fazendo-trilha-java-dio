package br.com.exercicio;

import javax.swing.JOptionPane;

public class Ex02 {
	/*
	 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a
	 * senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
	 * pedir as informações.
	 */
	public static void main(String[] args) {
		String nome;
		String senha;

		JOptionPane.showMessageDialog(null, "Faça o seu cadastro!");
		do {
			nome = JOptionPane.showInputDialog("Digite o nome do usuario:");
			senha = JOptionPane.showInputDialog("Digite o nome do usuario:");

			if (nome.equals(senha)) {
				JOptionPane.showMessageDialog(null,
						"Não é possivel realizar o cadastro, pois" + " o nome e a senha são os mesmos");
			}else {
				JOptionPane.showMessageDialog(null, "Cadastrador com sucesso!");
				JOptionPane.showMessageDialog(null, "Bem-vindo, "+ nome +"!");
			}
		} while (nome.equals(senha));
		
	}
}
