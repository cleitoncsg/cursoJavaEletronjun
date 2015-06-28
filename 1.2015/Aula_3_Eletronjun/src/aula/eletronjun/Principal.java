/*
 * Criar uma aplicação que leia dados de um carro
 * 	placa, modelo, ano, marca.
 * 	Dados do dono do carro
 * 	Nome, idade, CNH-String;
 * Mostrar Todos os dados do carro e do Dono.
 * 
 * 
 * */




package aula.eletronjun;

import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ler;
		Dono motorista;
		Carro carro;
		
		motorista = new Dono();
		ler = new Scanner(System.in);
		
		carro = new Carro(ler.next(), ler.next(), ler.nextInt(), ler.next());
		motorista.setNome(ler.next());
		motorista.setIdade(ler.nextInt());
		motorista.setCnh(ler.next());

		System.out.println(motorista.getNome());
		System.out.println(motorista.getIdade());
		System.out.println(motorista.getCnh());
		
		System.out.println(carro.getPlaca());
		System.out.println(carro.getAno());
		System.out.println(carro.getMarca());
		System.out.println(carro.getModelo());
	}

}
