package br.edu.ifba.principal;

import br.edu.ifba.basica.Celula;
import br.edu.ifba.lista.Lista;

public class Principal {

	public static void main(String[] args) {

		Celula ele1 = new Celula("Eu");
		Celula ele2 = new Celula("Ela");

		Lista lista = new Lista();

		lista.adicionarNoComeco("Lucas");
		lista.adicionarNoComeco("Gabriel");
		lista.adicionarNoComeco("Rodrigues");
		
		lista.adicionarNoFinal("Tchuko");
		lista.adicionarNoFinal("Manu");
		
		System.out.println(lista.listar());
	}
}
