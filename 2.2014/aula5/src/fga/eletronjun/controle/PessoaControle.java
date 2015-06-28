package fga.eletronjun.controle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import fga.eletronjun.modelo.Pessoa;

public class PessoaControle {
	
	static //Pessoa pessoa = new Pessoa();
	ArrayList<Pessoa> cadastro = new ArrayList<Pessoa>();
	static Scanner leia = new Scanner(System.in);
	
	
	
	public static void main(String[] args){
		
		int opcao = 0;
		
		for(;;){
			System.out.println("Digite a opção");
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
					System.out.println("Opção inválida\n");
					break;
			}
			
			
		}
		
	}



	private static void listar() {
		Iterator<Pessoa> i = cadastro.iterator();
		
		while(i.hasNext()){ //Enquanto tiver próximo
			System.out.println(i.next().toString()); //Imprima o elemento atual
			//System.out.println(i.next().getNome());
			//System.out.println(i.next().getIdade());
		}
	}



	private static void cadastrar() {
		Pessoa pessoa = new Pessoa();
		String nome;
		int idade;
		
		System.out.println("Digite um nome\n");
		nome = leia.nextLine();
		
		System.out.println("Digite uma idade\n");
		idade = Integer.parseInt(leia.nextLine());
		
		pessoa.setNome(nome);
		pessoa.setIdade(idade);
		
		cadastro.add(pessoa);
		
	}

	private static void menu() {
		System.out.println("1) Cadastrar");
		System.out.println("2) Listar");
	}

}
