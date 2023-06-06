package questao_03;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		Random ran = new Random();
		
		System.out.println("Números gerados: \n");

		for (int cont = 0; cont < 10; cont++) {

			Servico.receberInteiro(ran.nextInt(99));
		}

		System.out.println("");
		Servico.determinarSegundoMaior();
	}
}
