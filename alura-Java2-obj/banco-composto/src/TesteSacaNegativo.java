
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(300));
		
		conta.saca(300);
		System.out.println(conta.getSaldo());
		
		/*
		MANIPULAÇÃO DIRETA DE ATRIBUTOS PROIBIDA: nunca acesse o atributo saldo diretamente, senão negativos serão permitidos
		conta.saldo = conta.saldo - 300;
		System.out.println(conta.saldo);
		*/
		
		conta.numero = -1377;
		
		
	}
}
