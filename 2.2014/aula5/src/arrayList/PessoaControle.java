package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import fga.eletronjun.modelo.Pessoa;

public class PessoaControle {
	
	static Scanner leia = new Scanner(System.in);
	static ArrayList<Pessoa> cadastro = new ArrayList<Pessoa>();
	
	public static void main(String[] argumento){
		int opcao = 0;
		
		for(;;){
			menu();
			opcao = Integer.parseInt(leia.nextLine());
			
			switch (opcao) {
				case 1:
					cadastrar();
					break;
				case 2:
					listar();
					break;
		
				default:
					System.out.println("Opção inválida");
					break;
			}
		}
		
	}

	private static void menu() {
		System.out.println("1) Cadastrar");
		System.out.println("2)Listar pessoas cadastradas");
	}

	private static void cadastrar() {
		String nome;
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Digite o nome da pessoa para ser cadastrada\n");
		nome = leia.nextLine();
		pessoa.setNome(nome);
		cadastro.add(pessoa);	
	}

	private static void listar() {
		Iterator<Pessoa> i = cadastro.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next().getNome());
		}
	}


}
