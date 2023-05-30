package questao_02;

public class Servico {
	
	static double salar, quant;

	public static double receberSalario(double salario) {

		if (salario < 1320.00) {
			
			System.out.println("\n---------- ATENÇÃO ----------");
			System.out.println("\nProcure o Ministério do Trabalho!!");
			System.out.println("Seu salário está abaixo do permitido pela Constituição!!");
			
		}
		
		salar = salario;
		
		return salario;
	}

	public static double recerberQuantidadeDeSalarios(double quantidade) {

		quant = quantidade;
		
		return quantidade;
	}
	
	public static void calcularSalario() {
		 
		double resul = salar * quant; 
				
		System.out.println("\nResultado total: R$ " + resul);
	}
}