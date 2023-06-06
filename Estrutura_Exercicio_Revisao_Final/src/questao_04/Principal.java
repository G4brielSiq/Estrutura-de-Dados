package questao_04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Informe as palavras: \n");

		for (int cont = 0; cont < 5; cont++) {

			Servico.receberString(in.nextLine());
		}

		Servico.listarStrings();

		in.close();
	}
}