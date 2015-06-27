package interfaces;

public interface Media {

	final static int pes1 = 10;
	final static int pes2 = 40;
	final static int pes3 = 50;
	
	
	float mediaAritmetica(float nota1, float nota2);
	float mediaPonderada(float nota1, float nota2);
	float mediaAritmetica(float nota1, float nota2, float nota3);
	float mediaPonderada(float nota1, float nota2, float nota3);
}
