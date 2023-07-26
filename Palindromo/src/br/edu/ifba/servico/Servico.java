package br.edu.ifba.servico;

import java.util.Stack;

public class Servico {

	Stack<Character> pilha = new Stack<Character>();
	StringBuilder st = new StringBuilder();

	public boolean inverter(String palavra) {

		for (int cont = 0; cont < palavra.length(); cont++) {

			pilha.push(palavra.charAt(cont));
		}

		while (!pilha.isEmpty()) {

			st.append(pilha.pop());
		}

		return this.verificar(palavra);
	}

	public boolean verificar(String palavra) {

		if (palavra.equalsIgnoreCase(this.st.toString())) {

			return true;

		} else {

			return false;
		}
	}
}
