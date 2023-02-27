package br.com.metodo;

public class Usuario {

	public static void main(String[] args) {

		SmartTv tv = new SmartTv();
		
		
		
		if (tv.ligada == true) {
			System.out.println("Tv ligada? " + "Ligada");
			System.out.println("Canal atual? " + tv.canal);
			System.out.println("Volume atual? " + tv.volume);
		} else {
			System.out.println("Tv ligada? " + "Desligada");
		}

		/*tv.ligar();
		System.out.println("Novo status -> TV ligada ?" + tv.ligada);
		*/
		tv.diminuirVolume();
		tv.diminuirVolume();
		tv.diminuirVolume();
		tv.aumentarVolume();
		System.out.println("Volume atual: "+ tv.volume);
		
		/*tv.aumentarCanal();
		tv.aumentarCanal();
		tv.diminuirrCanal();
		System.out.println("Canal atual: "+ tv.canal);
		*/
		
		tv.mudarCanal(13);
		System.out.println("Canal atual: "+ tv.canal);
		tv.desligar();
		System.out.println("Novo status -> TV ligada ?" + tv.ligada);
	}
}
