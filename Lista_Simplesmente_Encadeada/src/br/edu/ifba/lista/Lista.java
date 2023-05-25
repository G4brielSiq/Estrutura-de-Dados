package br.edu.ifba.lista;

import br.edu.ifba.basicas.Celula;

public class Lista {

	private Celula primeiro;
	private Celula ultimo;

	private int totalElementos = 0;

	public void adicionarNoComeco(Object elemento) {

		Celula nova = new Celula(this.primeiro, elemento);

		this.primeiro = nova;

		if (this.totalElementos == 0) {

			this.ultimo = nova;
		}

		this.totalElementos++;
	}

	public void adicionarNoFinal(Object elemento) {

		if (this.totalElementos == 0) {

			adicionarNoComeco(elemento);

		} else {

			Celula nova = new Celula(elemento);

			this.ultimo.setProxima(nova);
			this.ultimo = nova;

			this.totalElementos++;
		}
	}

	public void adicionarPorPosicao(int posicao, Object elemento) {

		Celula aux = this.primeiro;

		if (posicao > this.totalElementos || posicao < 0) {

			throw new IllegalArgumentException("Posição inválida");
		}

		// if(posicao >= this.totalElementos ){

		for (int cont = 0; cont < posicao - 1; cont++) {

			aux = aux.getProxima();
		}
		
		Celula nova = new Celula(aux.getProxima(), elemento);
		aux.setProxima(nova);
		this.totalElementos++;
		// }
	}

	public void listar() {

		Celula aux = this.primeiro;

		for (int cont = 0; cont < this.totalElementos - 1; cont++) {

			System.out.print(aux.getElemento() + " - ");

			aux = aux.getProxima();
		}

		System.out.println(aux.getElemento());
	}
}
