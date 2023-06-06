package questao_01;

public class Principal {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta("Jonas", 100);
		Conta conta2 = new Conta("André", 500);
		Conta conta3 = new Conta("Lucas", 10);
		Conta conta4 = new Conta("Luiza", 100);
		Conta conta5 = new Conta("Alvez", 300);

		CadastrarConta.adicionarConta(conta1);
		CadastrarConta.adicionarConta(conta2);
		CadastrarConta.adicionarConta(conta3);
		
		CadastrarConta.adicionarContaPorPosicao(conta4, 0);
		CadastrarConta.adicionarContaPorPosicao(conta5, 4);
		
		CadastrarConta.listarConta();
		
		System.out.println("");
		
		CadastrarConta.removerContaPorPosicao(2);
		
		CadastrarConta.listarConta();
		
		System.out.println("");
		
		CadastrarConta.procurarConta(0);
		
		System.out.println("");
		
		CadastrarConta.procurarContaPeloNome("Alvez");
	}
}