package br.edu.ifba.principal;

import br.edu.ifba.fila.Fila;

public class Principal {

	public static void main(String[] args) {

		Fila f = new Fila();

		f.inserir("Teste");
		f.inserir("Teste2");
		f.inserir("Teste3");
		f.inserir("Teste4");
		f.inserir("Teste5");

		System.out.println(f.mostrar());

		System.out.println(f.remover());

		System.out.println(f.mostrar());

		if (!f.verificar()) {

			System.out.println("Lista com elementos");

		} else {

			System.out.println("Lista vazia");
		}
	}
}