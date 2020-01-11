
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta(); //associação a Conta pela variável contaDaMarcela
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.titular = new Cliente(); //associação entre objetos
		System.out.println(contaDaMarcela.titular);
		//Uma referência é tida como "null" porque ainda não foi populada (inserimos um valor dentro dela através do "new" ou apontando para uma referência já existente)
		
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
	}
}
