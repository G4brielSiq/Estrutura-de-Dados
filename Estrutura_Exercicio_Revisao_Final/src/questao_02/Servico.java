package questao_02;

public class Servico {

	static int[] arrayBin = new int[3];
	static int[] arrayDec = new int[3];

	static int total = 0;

	public static void converterBinarioParaDecimal(String binario) {

		arrayBin[total] = Integer.parseInt(binario);

		arrayDec[total] = Integer.parseInt(binario, 2);

		total++;
	}

	public static void listarArrays() {

		for (int cont = 0; cont < arrayBin.length; cont++) {

			if (arrayBin[cont] != 0) {

				System.out.println("\nNúmero Binário: " + arrayBin[cont]);
				System.out.println("Decimal correspondente: " + arrayDec[cont]);
			}
		}
	}
}