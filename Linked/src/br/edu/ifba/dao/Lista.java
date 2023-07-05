package br.edu.ifba.dao;

import java.util.LinkedList;

import br.edu.ifba.basica.Pessoa;

public class Lista {
	
	LinkedList<Pessoa> lista = new LinkedList<Pessoa>();
	
	public void adicionarInicio(Pessoa p) {
		
		this.lista.addFirst(p);
	}
	
	public void adicionarFim(Pessoa p) {
		
		this.lista.addLast(p);
	}
	
	public void adicionarPosicao(Pessoa p, int idex) {
		
		this.lista.add(idex, p);
	}
	
	public void remover(int idex) {
		
		this.lista.remove(idex);
	}
	
	public Pessoa removerInicio() {
		
		return this.lista.removeFirst();
	}
	
	public void removerFim() {
		
		this.lista.removeLast();
	}
	
	public String imprimir() {
		
		return this.lista.toString();
	}
}