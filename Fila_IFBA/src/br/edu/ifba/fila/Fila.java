package br.edu.ifba.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	Queue<Object> fila = new LinkedList<Object>();

	public void inserir(Object o) {

		this.fila.add(o);

	}

	public Object remover() {

		return this.fila.remove();

	}

	public boolean verificar() {

		return this.fila.isEmpty();
	}

	public String mostrar() {

		return (String) this.fila.toString();

	}
}
