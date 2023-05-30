package questao_02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Informe seu salário: R$ ");
		
		Servico.receberSalario(in.nextDouble());
		
		System.out.print("\nInforme quantos sálarios você recebe: ");
		
		Servico.recerberQuantidadeDeSalarios(in.nextDouble());
		
		Servico.calcularSalario();
		
		in.close();
	}

}
