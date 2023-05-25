package br.edu.ifba.principal;

import br.edu.ifba.basicas.Celula;
import br.edu.ifba.lista.Lista;

public class Principal {

	public static void main(String[] args) {
		
		Celula ele1 = new Celula("Eu");
		Celula ele2 = new Celula("Ela");
		
		Lista lista = new Lista();
		
		lista.adicionarNoComeco("Lucas");
		
		lista.adicionarNoComeco(ele1.getElemento());
		lista.adicionarNoComeco(ele2.getElemento());
		
		lista.adicionarNoFinal("Siqueira");
		lista.adicionarNoFinal("Gabriel");
		
		lista.adicionarPorPosicao(5, "Ovo");
		
		lista.listar();
	}

}
