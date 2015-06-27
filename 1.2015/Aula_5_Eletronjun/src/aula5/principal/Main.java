package aula5.principal;

import java.util.ArrayList;
import java.util.Scanner;

import aula5.dados.Homem;
import aula5.dados.Mulher;
import aula5.dados.Pessoa;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pessoa> p = new ArrayList<Pessoa>();
		String nome;
		String sexo;
		int idade;
		Object outro;
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			nome = ler.next();
			sexo = ler.next();
			idade = ler.nextInt();
			if(sexo.equals("m"))
			{
				outro = ler.next();
				p.add(new Homem(nome,sexo,idade,outro.toString()));
			}
			else
			{
				outro = ler.nextInt();
				p.add(new Mulher(nome,sexo,idade,Integer.parseInt(outro.toString())));
			}
			 
		}
		
		for (int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i));
		}
	}

}








