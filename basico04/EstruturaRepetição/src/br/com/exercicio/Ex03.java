package br.com.exercicio;

import javax.swing.JOptionPane;

public class Ex03 {
	/**
	 * Faça um programa que leia e valide as seguintes informações; Nome: maior que
	 * 3 caracteres; Idade: entre 0 e 150; Salário: maior que zero; Sexo: 'f' ou
	 * 'm'; Estado Civil: 's', 'c', 'v', 'd';
	 */

	public static void main(String[] args) {

		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;

		do {
			nome = JOptionPane.showInputDialog("Digite o seu nome");
			if (nome.length() <= 3) {
				JOptionPane.showMessageDialog(null, "Tem quer mais que 3 letras");
			}
		} while (nome.length() <= 3);

		do {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
			if (idade < 0 || idade > 150) {
				JOptionPane.showMessageDialog(null, "Idade invalidar!");
			}
		} while (idade < 0 || idade > 150);

		do {
			salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario:"));
			if (salario <= 0) {
				JOptionPane.showMessageDialog(null, "Salario invalido!");
			}
		} while (salario <= 0);

		do {
			sexo = JOptionPane.showInputDialog("Digite o seu sexo: m = masculino, f = feminino");
			if (!sexo.equals("f") && !sexo.equalsIgnoreCase("m")) {
				JOptionPane.showMessageDialog(null, "Sexo invalido!");
			}
		} while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));
		
		do {
			estadoCivil=JOptionPane.showInputDialog("Estado civil: s = solteiro, c = casado, v = viuvo, d = divorciado");
			if(!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v")
				&&	!estadoCivil.equalsIgnoreCase("d")) {
				JOptionPane.showMessageDialog(null, "Estado civil invalido!");
			}
		} while (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v")
				&&	!estadoCivil.equalsIgnoreCase("d"));
		
		System.out.println("Nome: "+ nome);
		System.out.println("Idade: "+ idade);
		System.out.println("Salario: "+ salario);
		System.out.println("Sexo: "+ sexo);
		System.out.println("Estado Civil: "+ estadoCivil);
		
		
		
		
	}

}
