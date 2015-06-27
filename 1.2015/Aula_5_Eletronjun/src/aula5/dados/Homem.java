package aula5.dados;

public class Homem extends Pessoa {

	private String estadoCivil;

	public Homem(String nome, String sexo, int idade, String estadoCivil) {
		super(nome, sexo, idade);
		setEstadoCivil(estadoCivil);
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String toString() {
		String retorna;
		retorna = "Nome: " + getNome() + "\nSexo: " + getSexo() + "\nIdade: "
				+ getIdade() + "\nEstado Civil: " + getEstadoCivil() +"\n";
		return retorna;
	}
}
