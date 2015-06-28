package fga;

public class Aluno {
	
	public static void main(String[] argumento){
		Pessoa pessoa = new Pessoa("Cleiton");
		System.out.println(pessoa.getNome());
		pessoa.setNome("Fatima");
		System.out.println(pessoa.getNome());
	}
}
