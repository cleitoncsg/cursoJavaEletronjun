package aula5.dados;

public class Mulher extends Pessoa {

	private int qtdGravidez;

	public Mulher(String nome, String sexo, int idade, int qtdGravidez) {
		super(nome, sexo, idade);
		setQtdGravidez(qtdGravidez);
	}

	public int getQtdGravidez() {
		return qtdGravidez;
	}

	public void setQtdGravidez(int qtdGravidez) {
		this.qtdGravidez = qtdGravidez;
	}

	public String toString() {
		String retorna;
		retorna = "Nome: " + getNome() + "\nSexo: " + getSexo() + "\nIdade: "
				+ getIdade() + "\nVezes Gravida: " + getQtdGravidez();
		return retorna;
	}
}











