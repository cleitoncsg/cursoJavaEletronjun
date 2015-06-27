package calculos;

import gerencia.MatriculaWeb;
import interfaces.Media;

public class PreCalculo extends MatriculaWeb implements Media,Comparable {
	
	@Override
	public float mediaAritmetica(float nota1, float nota2) {
		return (nota1 + nota2) / 2;
	}

	@Override
	public float mediaPonderada(float nota1, float nota2) {
		return (nota1 * pes1 + nota2 * pes2) / (pes1 + pes2);
	}

	@Override
	public float mediaAritmetica(float nota1, float nota2, float nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}

	@Override
	public float mediaPonderada(float nota1, float nota2, float nota3) {

		return (nota1 * pes1 + nota2 * pes2 + nota3 * pes3) / (pes1 + pes2 + pes3);
	}

	@Override
	public int compareTo(Object arg0) {

		return 0;
	}

}











