package questao_03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Informe o valor mínimo: ");
		
		int min = in.nextInt();
		
		System.out.print("Informe o valor máximo: ");
		
		int max = in.nextInt();

		Servico.determinarLimite(min, max);

		System.out.println("");
		
		in.close();
	}
}