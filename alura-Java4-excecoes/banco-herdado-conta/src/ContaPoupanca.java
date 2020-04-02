
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {// passe parâmetros do construtor da super class para chamá-lo
		super(agencia, numero);
	}

	// para criar isso: btn direito-source-override/implement methods

	@Override // anotação para o compilador: para o método automático e dá a opção de
				// reescrevê-lo
	public void deposita(double valor) {
		super.saldo += valor; // acessa método deposita, de Conta
	}

}
