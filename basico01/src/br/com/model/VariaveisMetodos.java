package br.com.model;

public class VariaveisMetodos {

	public static void main(String[] args) {

		/* VARIAVEIS */
		String primeironome = "Paulo";
		String sobrenome = "Chaves";
		String nomeTodo = nomeComple(primeironome, sobrenome);
		System.out.println(nomeTodo);

	
	}
		/************************************************************/

		/*METODOS = Eles semprem tem valores  */
		
		public static String nomeComple(String primeironome, String sobrenome) {
			return primeironome.concat(" ").concat(sobrenome);
		}
	

}