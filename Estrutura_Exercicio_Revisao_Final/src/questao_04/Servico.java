package questao_04;

public class Servico {

	static String[] arrayString = new String[5];
	static String[] arrayFiltrado = new String[5];

	static int total1 = 0, total2 = 0;

	public static void receberString(String str) {

		arrayString[total1] = str;
		total1++;

		if (str.substring(0, 1).equals("a") || str.substring(0, 1).equals("A")) {

			arrayFiltrado[total2] = str;
			total2++;
		}
	}

	public static void listarStrings() {

		System.out.println("\nPalavras fornecidas: \n");

		for (int cont = 0; cont < arrayString.length; cont++) {

			System.out.println("| " + arrayString[cont] + " |");
		}

		System.out.println("");

		System.out.println("Palavras começadas com A: \n");

		for (int cont = 0; cont < arrayFiltrado.length; cont++) {

			if (arrayFiltrado[cont] != null) {

				System.out.println("| " + arrayFiltrado[cont] + " |");
			}
		}
	}
}