package polimorfismo;

public class DepartamentoTI extends Empresa {

	@Override
	double calculaSalarioFinal(int quantidadeFuncionarios, double salario){
		double somaSalario = 0;
		
		for(int i = 0; i < quantidadeFuncionarios; i++){
			somaSalario += salario;
		}
		return somaSalario*1.15;
	}

}
