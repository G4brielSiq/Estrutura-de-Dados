package questao_04;

public class Servico {

	static int[] jogador = new int[3];

	public static void determinarJogadas(int val1, int val2, int val3) {

		jogador[0] = val1;
		jogador[1] = val2;
		jogador[2] = val3;
	}

	public static void listarJogadas() {

		for (int cont = 0; cont < jogador.length; cont++) {

			if (cont == 0) {

				System.out.println("Jogador A: | " + jogador[cont] + " |");

			} else if (cont == 1) {

				System.out.println("Jogador B: | " + jogador[cont] + " |");

			} else if (cont == 2) {

				System.out.println("Jogador C: | " + jogador[cont] + " |");
			}
		}
	}

	public static void informarResultado() {

		int total = (jogador[0] + jogador[1] + jogador[2]);

		if (total == 0 || total == 3) {

			System.out.println("\nNÃO HOUVE GANHADOR!!!");
		}

		if (jogador[0] != jogador[1] && jogador[0] != jogador[2]) {

			System.out.println("\nJogador A VENCEU!!!");

		} else if (jogador[1] != jogador[0] && jogador[1] != jogador[2]) {

			System.out.println("\nJogador B VENCEU!!!");

		} else if (jogador[2] != jogador[0] && jogador[2] != jogador[1]) {

			System.out.println("\nJogador C VENCEU!!!");
		}
	}
}