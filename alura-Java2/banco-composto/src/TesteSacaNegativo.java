
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(300));
		
		conta.saca(300);
		System.out.println(conta.getSaldo());
		
		/*
		MANIPULA��O DIRETA DE ATRIBUTOS PROIBIDA: nunca acesse o atributo saldo diretamente, sen�o negativos ser�o permitidos
		conta.saldo = conta.saldo - 300;
		System.out.println(conta.saldo);
		*/
		
		conta.numero = -1377;
		
		
	}
}
