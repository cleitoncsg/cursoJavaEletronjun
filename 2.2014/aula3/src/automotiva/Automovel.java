package automotiva;

public class Automovel {
	protected String nome;
	protected double tamanho;
	
	public static void anda(){
		System.out.println("Anda\n");
	}
	
	public static double calculaVelocidadeMedia(double tempo, double distancia){
		return distancia/tempo;
	}
}
