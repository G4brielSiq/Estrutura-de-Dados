package questao_02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número binário: ");

		Servico.converterBinarioParaDecimal(scan.nextLine());
		
		Servico.listarArrays();
		
		scan.close();
	}
}