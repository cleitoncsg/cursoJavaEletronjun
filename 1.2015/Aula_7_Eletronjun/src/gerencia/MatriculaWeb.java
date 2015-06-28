package gerencia;

public class MatriculaWeb {
	
	public static String calcMencao(float nota)
	{
		if(nota < 5)
			return "MI";
		else if(nota < 7)
			return "MM";
		else if(nota < 9)
			return "MS";
		else
			return "SS";
	}
}
