package br.com.entidade;

public class Carro {

	String cor;
	String modelo;
	int capacidadeCombistivel;
	
	
	public Carro(){
		
	}

	
	
	public Carro(String cor, String modelo, int capacidadeCombistivel) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeCombistivel = capacidadeCombistivel;
	}



	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadeCombistivel() {
		return capacidadeCombistivel;
	}

	public void setCapacidadeCombistivel(int capacidadeCombistivel) {
		this.capacidadeCombistivel = capacidadeCombistivel;
	}

	public double totalValorTanque(double valorCombustivel) {
		double total = valorCombustivel * capacidadeCombistivel;
		return total;
	}

}
