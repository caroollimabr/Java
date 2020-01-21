//Os atributos e m�todos s�o herdados, os construtores n�o s�o (pertencem � sua classe, apenas).
public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); /*
								 * busca o construtor padr�o da super class se n�o houver par�metros, busca o
								 * customizado se houver par�metros iguais aos do construtor da super class
								 */
	}

	@Override // anota��o para o compilador: para o m�todo autom�tico e d� a op��o de
				// reescrev�-lo
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	// para criar isso: btn direito-source-override/implement methods
	@Override
	public void deposita(double valor) {
		super.saldo += valor; // acessa m�todo deposita, de conta

	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}
