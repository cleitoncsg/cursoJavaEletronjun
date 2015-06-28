package polimorfismo;

import java.util.Scanner;



public class ExecutaDepartamento {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcao = 0;
		
		for(;;){
			menu();
			opcao = Integer.parseInt(leia.nextLine());
			
			switch (opcao) {
				case 1:
					chamaDepartamentoTI();
					break;
				case 2:
					chamaDepartamentoRH();
					break;
		
				default:
					System.out.println("Opção inválida\n");
					break;
			}
		}
	}
	
	public static void chamaDepartamentoTI() {
		DepartamentoTI departamentoTI = new DepartamentoTI();
		int opcao = 0, quantidade;
		double salario;
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		System.out.println("Digite o salario\n");
		salario = Double.parseDouble(leia.nextLine());
		System.out.println("Digite a quantidade de funcionarios\n");
		quantidade = Integer.parseInt(leia.nextLine());
		System.out.println("Salário departamento de TI: R$ "+departamentoTI.calculaSalarioFinal(quantidade, salario));
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
	}
	
	public static void chamaDepartamentoRH() {
		DepartamentoRH departamentoRH = new DepartamentoRH();
		int opcao = 0, quantidade;
		double salario;
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		System.out.println("Digite o salario\n");
		salario = Double.parseDouble(leia.nextLine());
		System.out.println("Digite a quantidade de funcionarios\n");
		quantidade = Integer.parseInt(leia.nextLine());
		System.out.println("Salário departamento RH: R$ "+departamentoRH.calculaSalarioFinal(quantidade, salario));
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
	}

	static void  menu(){
		System.out.println("1)Calcular Folha pagamento Departamento TI");
		System.out.println("2)Calcular Folha pagamento Departamento RH");
	}
}
