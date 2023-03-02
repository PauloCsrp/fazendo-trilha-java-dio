package ifElse;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {

		int mes = Integer.parseUnsignedInt(JOptionPane.showInputDialog("Digite um numero de 1 a 12"));

		if (mes == 1) {
			System.out.println("Janeiro");

		} else if (mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Março");
		} else if (mes == 4) {
			System.out.println("abril");
		} else if (mes == 5) {
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("julho");
		} else if (mes == 7) {
			System.out.println("junho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if (mes == 11) {
			System.out.println("Novembro");
		} else if (mes == 12) {
			System.out.println("Dezembro");
		} else {
			JOptionPane.showMessageDialog(null, "Numero Invalido");

		}

		if (mes == 1 || mes ==7 || mes==12) {
			System.out.println("Feriado");
	}

}
