package br.edu.ifba.principal;

import br.edu.ifba.basica.Pessoa;
import br.edu.ifba.dao.Lista;

public class Principal {

	public static void main(String[] args) {

		Lista l = new Lista();

		Pessoa p = new Pessoa();
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();

		p.setNome("Lucas");
		p.setCpf("156.235.698-56");

		p1.setNome("João");
		p1.setCpf("102.254.568-89");

		p2.setNome("Viado");
		p2.setCpf("478.511.598-56");

		l.adicionarInicio(p2);
		l.adicionarFim(p1);
		l.adicionarPosicao(p, 1);
		
		System.out.println(l.imprimir());
		
		l.removerFim();
		
		System.out.println(l.imprimir());
		
		l.remover(1);
		
		System.out.println(l.imprimir());
	}

}
