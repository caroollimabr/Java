
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta(); //associa��o a Conta pela vari�vel contaDaMarcela
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.titular = new Cliente(); //associa��o entre objetos
		System.out.println(contaDaMarcela.titular);
		//Uma refer�ncia � tida como "null" porque ainda n�o foi populada (inserimos um valor dentro dela atrav�s do "new" ou apontando para uma refer�ncia j� existente)
		
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
	}
}
