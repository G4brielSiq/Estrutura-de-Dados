package br.edu.ifba.principal;

import java.util.Scanner;
import br.edu.ifba.servico.Servico;

public class Principal {

	public static void main(String[] args) {

		Servico s = new Servico();
		Scanner in = new Scanner(System.in);

		for (int cont = 0; cont < 5; cont++) {

			s.preencherFila(in.nextInt());
		}

		System.out.println(s.inverter().toString());

		in.close();
	}

}
