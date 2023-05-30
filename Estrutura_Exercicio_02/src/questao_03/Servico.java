package questao_03;

public class Servico {

	public static void determinarLimite(int min, int max) {

		int[] arrayNum = new int[(max - min) - 1];

		int val = 0;

		for (int num = (min + 1); num < max; num++) {

			arrayNum[val] = num;
			val++;
		}

		System.out.println("\nValores inteiros não extremos: ");
		System.out.println("");

		for (int cont = 0; cont < arrayNum.length; cont++) {

			System.out.println("| " + arrayNum[cont] + " |");
		}
	}
}