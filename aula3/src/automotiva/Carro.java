package automotiva;

import java.util.Scanner;

public class Carro extends Automovel{
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int opcao = 0;
		
		for(;;){
			menu();
			opcao = Integer.parseInt(leia.nextLine());
			
			switch (opcao) {
				case 1:
					anda();
					break;
				case 2:
					System.out.println(calculaVelocidadeMedia(10, 100));
					break;
		
				default:
					System.out.println("Opção inválida\n");
					break;
			}
		}
	}
	
	public static void menu(){
		System.out.println("1) Verificar andar\n");
		System.out.println("2) Calcular Velocidade\n");
	}
}
