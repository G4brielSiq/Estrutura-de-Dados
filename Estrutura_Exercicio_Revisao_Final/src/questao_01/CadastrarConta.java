package questao_01;

public class CadastrarConta {

	static private Conta[] conta = new Conta[5];
	static int total = 0;

	public static void adicionarConta(Conta con) {

		aumentarVetor();

		conta[total] = con;
		total++;
	}

	public static void adicionarContaPorPosicao(Conta con, int posicao) {

		aumentarVetor();

		if (conta[posicao] != null) {

			for (int cont = total; cont > posicao; cont--) {

				conta[cont] = conta[cont - 1];
			}

			conta[posicao] = con;
			total++;

		} else if (conta[posicao] == null) {

			conta[posicao] = con;
			total++;
		}
	}

	public static void removerContaPorPosicao(int posicao) {

		conta[posicao] = null;

		for (int cont = posicao + 1; cont < conta.length; cont++) {

			conta[cont - 1] = conta[cont];
			conta[cont] = null;
		}

		total--;
	}

	public static void aumentarVetor() {

		if (total >= conta.length) {

			Conta[] newConta = new Conta[conta.length * conta.length];

			System.arraycopy(conta.length, 0, newConta, 0, conta.length);

			conta = newConta;
		}
	}

	public static void listarConta() {

		for (int cont = 0; cont < conta.length; cont++) {

			System.out.println(conta[cont]);
		}
	}

	public static void procurarContaPeloNome(String nome) {

		for (int cont = 0; cont < conta.length; cont++) {

			if (conta[cont] != null) {

				if (nome == conta[cont].getNome()) {

					System.out.println(conta[cont]);
				}
			}
		}
	}

	public static void procurarConta(int posicao) {

		for (int cont = 0; cont < conta.length; cont++) {

			if (conta[cont] != null) {

				System.out.println(conta[posicao]);

				break;
			}
		}
	}
}