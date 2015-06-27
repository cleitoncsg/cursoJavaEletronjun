package polimorfismo;

public class DepartamentoRH extends Empresa{
	
	@Override
	double calculaSalarioFinal(int quantidadeFuncionarios, double salario){
		double somaSalario = 0;
		
		for(int i = 0; i < quantidadeFuncionarios; i++){
			somaSalario += salario;
		}
		return somaSalario*1.10;
	}

}
