package fga;

public class Pessoa {
	
	private String nome;
	
	//Método construtor
	public Pessoa (String nome){
		this.nome = nome;
	}
	//Método recuperador
	public String getNome() {
		return nome;
	}
	
	//Método modificador
	public void setNome(String nome) {
		this.nome = nome;
	}
}
