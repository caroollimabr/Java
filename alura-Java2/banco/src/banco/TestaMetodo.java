package banco;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaCarol = new Conta(); //Java zera o valor dos atributos quando adicionamos a palavra "new"
		contaDaCarol.saldo = 1000000;
		contaDaCarol.deposita(5000); //nomeDaReferencia.nomeDoMetodo();
		System.out.println(contaDaCarol.saldo);
		
		boolean conseguiuRetirar = contaDaCarol.saca(200);
		System.out.println(contaDaCarol.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(200);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDaCarol);
		if(sucessoTransferencia) {
			System.out.println("Transferência realizada com sucesso.");
		} else {
			System.out.println("Transferência não realizada. Verifique seu saldo.");
		}
		
		contaDaMarcela.transfere(300, contaDaCarol); //referencia.metodo(var, var);
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaCarol.saldo);
		
		contaDaCarol.titular = "Carolina Lima";
		System.out.println(contaDaCarol.titular);
	}
	
}
