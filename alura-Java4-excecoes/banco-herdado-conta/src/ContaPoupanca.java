
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {// passe par�metros do construtor da super class para cham�-lo
		super(agencia, numero);
	}

	// para criar isso: btn direito-source-override/implement methods

	@Override // anota��o para o compilador: para o m�todo autom�tico e d� a op��o de
				// reescrev�-lo
	public void deposita(double valor) {
		super.saldo += valor; // acessa m�todo deposita, de Conta
	}

}
