package polimorfismo;

public abstract class Empresa {
	
	double calculaSalarioFinal(int quantidadeFuncionarios, double salario){
		double somaSalario = 0;
		
		for(int i = 0; i < quantidadeFuncionarios; i++){
			somaSalario += salario;
		}
		return somaSalario;
	}
}
