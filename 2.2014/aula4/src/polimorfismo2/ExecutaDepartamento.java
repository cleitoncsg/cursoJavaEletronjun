package polimorfismo2;

public class ExecutaDepartamento {
	
	public static void main(String[] argumento){
		DepartamentoTI departamentoTI = new DepartamentoTI();
		System.out.println(departamentoTI.calculaImpostoRenda(1000));
		System.out.println(departamentoTI.calculaSalarioFinal(5, 1000));
	}

}
