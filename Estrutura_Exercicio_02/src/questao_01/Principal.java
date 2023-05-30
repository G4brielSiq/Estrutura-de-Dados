package questao_01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		
		Servico.retornarNumeros(in.nextInt());
		
		in.close();
	}
}