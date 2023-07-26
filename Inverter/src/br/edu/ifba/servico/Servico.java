package br.edu.ifba.servico;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Servico {

	Queue<Integer> fila = new LinkedList<Integer>();
	Stack<Integer> pilha = new Stack<Integer>();
	
	public void preencherFila(int numero) {
		
		pilha.push(numero);
	}
	
	public Queue<Integer> inverter() {
		
		while(!pilha.isEmpty()) {
			
			fila.add(pilha.pop());
		}
		
		return fila;
	}
}
