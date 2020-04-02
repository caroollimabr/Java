//Os atributos e métodos são herdados, os construtores não são (pertencem à sua classe, apenas).
public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); /*
								 * busca o construtor padrão da super class se não houver parâmetros, busca o
								 * customizado se houver parâmetros iguais aos do construtor da super class
								 */
	}

	@Override // anotação para o compilador: para o método automático e dá a opção de
				// reescrevê-lo
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	// para criar isso: btn direito-source-override/implement methods
	@Override
	public void deposita(double valor) {
		super.saldo += valor; // acessa método deposita, de conta

	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}
