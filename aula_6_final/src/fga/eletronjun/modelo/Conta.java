package fga.eletronjun.modelo;

public class Conta {
	private int numero;
	private double valorDeposito;
	private double valorRetirada;
	
	public Conta(){}
	
	public double getValorDeposito() {
		return valorDeposito;
	}
	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}
	public double getValorRetirada() {
		return valorRetirada;
	}
	public void setValorRetirada(double valorRetirada) {
		this.valorRetirada = valorRetirada;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
