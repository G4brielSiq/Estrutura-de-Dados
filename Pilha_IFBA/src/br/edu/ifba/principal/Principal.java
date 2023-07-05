package br.edu.ifba.principal;

import br.edu.ifba.basica.Pilha;

public class Principal {

	public static void main(String[] args) {

		Pilha p = new Pilha();

		p.inserir("Teste");
		p.inserir("Teste1");
		p.inserir("Teste2");
		p.inserir("Teste3");

		System.out.println(p.mostrar());

		System.out.println(p.remover());

		System.out.println(p.mostrar());

		if (p.verificar()) {

			System.out.println("Pilha vazia");

		} else {

			System.out.println("Pilha com elementos");
		}
	}
}