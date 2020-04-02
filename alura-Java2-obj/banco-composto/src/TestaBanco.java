
public class TestaBanco {
	public static void main(String[] args) {
		Cliente carolina = new Cliente(); //Criação de referência a um cliente
		carolina.nome = "Carolina Lima";
		carolina.cpf = "111.111.111-11";
		carolina.profissao = "Programadora";
		
		//criação da conta da cliente referida
		Conta contaDaCarol = new Conta();
		contaDaCarol.deposita(100);
		
		contaDaCarol.titular = carolina;
		System.out.println(contaDaCarol.titular.nome);
		
		
	}
}
