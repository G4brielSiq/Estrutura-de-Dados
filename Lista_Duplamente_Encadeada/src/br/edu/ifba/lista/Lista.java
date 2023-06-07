package br.edu.ifba.lista;

import br.edu.ifba.basica.Celula;

public class Lista {

	private Celula primeiro;
	private Celula ultimo;

	int totalElementos = 0;

	public void adicionarNoComeco(Object elemento) {

		if (this.totalElementos == 0) {

			Celula nova = new Celula(this.primeiro, elemento);

			this.primeiro = nova;
			this.ultimo = nova;

			this.totalElementos++;

		} else {

			Celula nova = new Celula(this.primeiro, elemento);

			this.primeiro.setAnterior(nova);
			this.primeiro = nova;

			this.totalElementos++;

		}
	}

	public void adicionarNoFinal(Object elemento) {

		if (this.totalElementos == 0) {

			adicionarNoComeco(elemento);

		} else {

			Celula nova = new Celula();

			nova.setElemento(elemento);

			this.ultimo.setProximo(nova);

			nova.setAnterior(ultimo);

			this.ultimo = nova;

			this.totalElementos++;
		}
	}

	public String listar() {

		if (this.totalElementos == 0) {

			return "[]";
		}

		StringBuffer lista = new StringBuffer();

		Celula aux = this.primeiro;

		lista.append("[");

		for (int cont = 0; cont < this.totalElementos - 1; cont++) {

			lista.append(aux.getElemento());
			lista.append(",");
			aux = aux.getProximo();

		}

		lista.append(aux.getElemento());
		lista.append("]");

		return lista.toString();
	}

}
