package engenharias;

import java.util.Scanner;

public class Fatorial {

	private static int numero;
	private static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite um numero, por favor\n");
		numero = Integer.parseInt(leia.nextLine());
		
		System.out.printf("Fatorial de %d = %d\n",numero, calculoFatorial(numero));
	}

	public static int calculoFatorial(int numero) {
		int fatorial = 1;
		
		for(int i = 1; i <= numero; i++){
			fatorial = fatorial*i;
		}
		
		return fatorial;
	}

}
