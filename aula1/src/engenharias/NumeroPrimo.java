package engenharias;

import java.util.Scanner;

public class NumeroPrimo {
	
	private static int numero;
	private static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite um numero, por favor\n");
		numero = Integer.parseInt(leia.nextLine());
		
		if(calculoNumeroPrimo(numero) == true){
			System.out.println("O numero e primo\n");
		}
		else{
			System.out.println("O numero nao e primo\n");
		}
		
	}

	public static boolean calculoNumeroPrimo(int numero) {
		int contadorPrimo = 0;
		
		for(int i = 1; i <= numero; i++){
			if(numero % i == 0){
				contadorPrimo++;
			}
		}
		
		if(contadorPrimo <= 2){
			return true;
		}
		else{
			return false;
		}
	}

}
