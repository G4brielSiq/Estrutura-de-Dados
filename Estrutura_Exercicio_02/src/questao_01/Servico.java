package questao_01;

public class Servico {
	
	public static void retornarNumeros(int numero) {
		
		int ant = numero - 1;
		int suc = numero + 1;
		
		System.out.println("\nSeu antecessor: " + ant + "\nSeu sucessor: " + suc);
	}
}