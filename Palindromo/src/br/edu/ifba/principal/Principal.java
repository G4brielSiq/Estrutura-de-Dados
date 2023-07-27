package br.edu.ifba.principal;

import java.util.Scanner;

import br.edu.ifba.basica.Servico;

public class Principal {

	public static void main(String[] args) {

		Servico s = new Servico();
		Scanner in = new Scanner(System.in);

		if (s.inverter(in.next())) {

			System.out.println("É um Palíndromo!");
			
		} else {

			System.out.println("Não é um Palíndromo!");
		}

		in.close();
	}
}