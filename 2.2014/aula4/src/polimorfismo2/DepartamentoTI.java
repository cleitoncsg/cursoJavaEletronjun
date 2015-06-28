package polimorfismo2;

public class DepartamentoTI extends Empresa {
	
	double calculaSalarioFinal(int quantidade, double salario){
		double somaSalario = 0;
		for(int i = 0; i < quantidade; i++){
			somaSalario += salario;
		}
		
		return somaSalario*1.25;
	}
	
	double calculaImpostoRenda(double salario){
		return salario*0.25;
	}
}
