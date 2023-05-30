package questao_04;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		Random r = new Random();

		int val1 = r.nextInt(2);
		int val3 = r.nextInt(2);
		int val2 = r.nextInt(2);
		
		Servico.determinarJogadas(val1, val2, val3);
		
		Servico.listarJogadas();
		
		Servico.informarResultado();
	}
}