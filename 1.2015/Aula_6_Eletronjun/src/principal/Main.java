package principal;

import dados.Automovel;
import dados.Carro;

public class Main {

	public static void main(String[] args) {
		Automovel a;
		Carro c1 = new Carro("Fiat","Uno","Gasolina",1.5f);

		c1.setTamportaMala(2f);
		
		System.out.println(c1.getMarca());
		System.out.println(c1.getModelo());
		System.out.println(c1.getTipoCombustivel());
		System.out.println(c1.getTamportaMala());

	}

}
