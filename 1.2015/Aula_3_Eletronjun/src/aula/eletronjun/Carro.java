package aula.eletronjun;

public class Carro {

	private String placa;
	private String modelo;
	private int ano;
	private String marca;
	
	public Carro(String placa, String modelo, int ano, String marca) {
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public String getMarca() {
		return marca;
	}
}
