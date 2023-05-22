package colecao;

import basicas.Filial;

public class ColecaoFilial {

	static Filial[] arrayFil = new Filial[3];
	static int total = 0;

	public static void cadastrarFilial(Filial fil) {

		aumentaArray();

		arrayFil[total] = fil;
		total++;
	}

	public static void cadastrarFilialPorPosicao(Filial fil, int posicao) {

		if (posicao >= arrayFil.length) {

			total = total + 100;
			aumentaArray();
			total = total - 100;
		}

		if (arrayFil[posicao] == null) {

			arrayFil[posicao] = fil;
			total++;

		} else {

			System.out.println("POSICAO OCUPADA");
		}
	}

	public static void listarFiliais() {

		for (int cont = 0; cont < arrayFil.length; cont++) {

			System.out.println(arrayFil[cont]);
			System.out.println("");
		}
	}

	public static Filial procurarFilialPorNome(String nome) {

		for (int cont = 0; cont < arrayFil.length; cont++) {

			if (arrayFil[cont] != null) {

				if (nome == arrayFil[cont].getNome()) {

					System.out.println(arrayFil[cont]);
					return arrayFil[cont];
				}
			}
		}

		return null;
	}

	public static void removerFilialPorPosicao(int posicao) {

		aumentaArray();

		for (int cont = 0; cont < arrayFil.length; cont++) {

			if (arrayFil[posicao] != null) {

				arrayFil[posicao] = null;
				total--;

			}
		}
	}

	public static void aumentaArray() {

		if (total >= arrayFil.length) {

			Filial[] newArrayFil = new Filial[arrayFil.length * 3];

			System.arraycopy(arrayFil, 0, newArrayFil, 0, arrayFil.length);

			arrayFil = newArrayFil;
		}
	}
}
