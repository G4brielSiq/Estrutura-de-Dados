package br.edu.ifba.basica;

public class Celula {

	private Celula proximo;
	private Celula anterior;
	private Object elemento;

	public Celula() {
	}

	public Celula(Object elemento) {
		this.elemento = elemento;
	}

	public Celula(Celula proximo, Object elemento) {
		this.proximo = proximo;
		this.elemento = elemento;
	}

	public Celula(Celula proximo, Celula anterior, Object elemento) {
		this.proximo = proximo;
		this.anterior = anterior;
		this.elemento = elemento;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	@Override
	public String toString() {
		return "Celula [proximo=" + proximo + ", anterior=" + anterior + ", elemento=" + elemento + "]";
	}
}
