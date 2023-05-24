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
	
	public void listar() {
		
		Celula aux = this.primeiro;
		
		for(int cont = 0; cont < this.totalElementos - 1; cont++) {
			
			System.out.print(aux.getElemento() + " - ");
			
			aux = aux.getProxima();
		}
		
		System.out.println(aux.getElemento());
	}

}
