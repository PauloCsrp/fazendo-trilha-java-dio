package br.com.metodo;

public class SmartTv {

	boolean ligada = true;
	int canal = 1;
	int volume = 25;

	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}

	public void aumentarCanal() {
		canal++;
		System.out.println("Canal foi para o canal " + canal);
	}

	public void diminuirrCanal() {
		canal--;
		System.out.println("Canal foi para o canal " + canal);
	}

	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = false;
	}

	public void aumentarVolume() {

		volume++;
		System.out.println("Aumentando o volume para: " + volume);
	}

	public void diminuirVolume() {
		volume--;
		System.out.println("Diminuindo o volume para: " + volume);
	}
}
