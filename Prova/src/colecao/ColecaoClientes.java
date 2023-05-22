package colecao;

import basicas.Cliente;

public class ColecaoClientes {

	static Cliente[] arrayCli = new Cliente[3];
	static int total = 0;

	public static void cadastrarCliente(Cliente cli) {

		aumentaArray();

		arrayCli[total] = cli;
		total++;
	}

	public static void cadastrarClientePorPosicao(Cliente cli, int posicao) {

		if (posicao >= arrayCli.length) {

			total = total + 100;
			aumentaArray();
			total = total - 100;
		}

		if (arrayCli[posicao] == null) {

			arrayCli[posicao] = cli;
			total++;

		} else {

			System.out.println("POSICAO OCUPADA");
		}
	}

	public static void listarClientes() {

		for (int cont = 0; cont < arrayCli.length; cont++) {

			System.out.println(arrayCli[cont]);
			System.out.println("");
		}
	}

	public static void procurarClientePorNome(String nome) {

		for (int cont = 0; cont < arrayCli.length; cont++) {

			if (arrayCli[cont] != null) {

				if (nome == arrayCli[cont].getNome()) {

					System.out.println(arrayCli[cont]);

				}
			}
		}
	}

	public static void removerClientePorPosicao(int posicao) {

		aumentaArray();

		for (int cont = 0; cont < arrayCli.length; cont++) {

			if (arrayCli[posicao] != null) {

				arrayCli[posicao] = null;
				total--;

			}
		}
	}

	public static void aumentaArray() {

		if (total >= arrayCli.length) {

			Cliente[] newArrayCli = new Cliente[arrayCli.length * 3];

			System.arraycopy(arrayCli, 0, newArrayCli, 0, arrayCli.length);

			arrayCli = newArrayCli;
		}
	}

}
