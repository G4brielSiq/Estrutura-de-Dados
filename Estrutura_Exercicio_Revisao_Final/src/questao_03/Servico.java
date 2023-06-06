package questao_03;

public class Servico {

	static int[] arrayInt = new int[10];

	static int total = 0;
	static int priMaior = Integer.MIN_VALUE;
	static int segMaior = Integer.MIN_VALUE;

	public static void receberInteiro(int num) {

		arrayInt[total] = num;
		total++;

		System.out.println("| " + num + " |");
	}

	public static void determinarSegundoMaior() {

		for (int num : arrayInt) {

			if (num > priMaior) {

				segMaior = priMaior;
				priMaior = num;

			} else if (num > segMaior && num < priMaior) {

				segMaior = num;
			}
		}

		System.out.print("Segundo maior número: " + segMaior);
	}
}