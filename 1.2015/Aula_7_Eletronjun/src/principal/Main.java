package principal;

import calculos.PreCalculo;

public class Main {

	public static void main(String[] args) {
		PreCalculo p = new PreCalculo();

		System.out.println(p.mediaAritmetica(10f, 9.99f));
		System.out.println(p.mediaAritmetica(5.5f, 8.5f, 4f));
		
	}

}
