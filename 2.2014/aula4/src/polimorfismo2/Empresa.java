package polimorfismo2;

public abstract class Empresa {
	
	double calculaSalarioFinal(int quantidade, double salario){
		double somaSalario = 0;
		for(int i = 0; i < quantidade; i++){
			somaSalario += salario;
		}
		
		return somaSalario;
	}
	
	abstract double calculaImpostoRenda(double salario);

}
