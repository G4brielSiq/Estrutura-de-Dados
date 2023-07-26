package br.edu.ifba.principal;

import java.util.Scanner;

import br.edu.ifba.servico.Servico;

public class Principal {

	public static void main(String[] args) {

		Servico s = new Servico();
		Scanner in = new Scanner(System.in);

		if (s.inverter(in.next())) {

			System.out.println("É palíndromo");
			
		} else {

			System.out.println("Não é palíndromo");
		}

		in.close();
	}
}
