package principal;

import basicas.Cliente;
import basicas.Filial;
import colecao.ColecaoClientes;
import colecao.ColecaoFilial;

public class Principal {

	public static void main(String[] args) {

		Filial fil1 = new Filial("Arthur", "Água Branca");
		Filial fil2 = new Filial("Amanda", "Paulo Afonso");
		Filial fil3 = new Filial("Gabriel", "Água Branca");

		ColecaoFilial.cadastrarFilial(fil1);
		ColecaoFilial.cadastrarFilial(fil2);

		ColecaoFilial.cadastrarFilialPorPosicao(fil3, 4);

		ColecaoFilial.removerFilialPorPosicao(5);

		ColecaoFilial.listarFiliais();

		ColecaoFilial.procurarFilialPorNome("Gabriel");
		
		System.out.println("");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("");
		
		Cliente cli1 = new Cliente("Clara","999777545","52.563.652-59",fil1);
		Cliente cli2 = new Cliente("Josefa","999563254","54.521.025-58",fil2);
		Cliente cli3 = new Cliente("André","996563254","54.215.154-85",fil3);
		
		ColecaoClientes.cadastrarCliente(cli1);
		ColecaoClientes.cadastrarCliente(cli2);
		
		ColecaoClientes.cadastrarClientePorPosicao(cli3, 5);
		
		ColecaoClientes.removerClientePorPosicao(0);
		
		ColecaoClientes.listarClientes();
		
		ColecaoClientes.procurarClientePorNome("Josefa");
	}

}
