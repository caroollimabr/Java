
public class Conta {
	// atributos (semelhantes ao var)
	private double saldo = 100; // se vc não especificar, todas os saldos terão esse valor ---- ATRIBUTO
								// PRIVADO: não pode ser lido ou modificado fora da classe (ENCAPSULAMENTO). O
								// comum é que todos os atributos sejam privados.
	int agencia;
	int numero;
	Cliente titular; /*COMPOSIÇÃO: tipo Cliente porque é atributo da classe Cliente

	Cliente titular = new Cliente(); ---- Toda a vez que o new é acionado para uma Conta, temos um novo Cliente (nao faremos neste projeto porque toda conta deve ser associada a um novo cliente (um cliente não pode ter duas contas,por ex.)
	*/
	/*
	 * String cpf; String profissao; ---- classe começa a ficar cheia de infos que
	 * não têm exatamente a ver com uma conta bancária, como profissão e CPF (vamos
	 * criar um novo projeto com essas informações.
	 */

	// metodos
	void deposita(double valor) { // deposita é um método ("parecido c função") / se a função for vazia, usar void
		this.saldo = this.saldo + valor; // valor é um argumento, saldo é variável, por isso coloca-se this (é opcional, mas recomendado)

	}

	public boolean saca(double valor) { // método públic tipo boolean
		if (this.saldo >= valor) {
			this.saldo -= valor; // saldo = saldo - valor
			return true; // return para a execução do método e retorna para quem está chamando
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) { // vírgula a cada argumento
		if (this.saldo >= valor) {
			this.saldo -= valor; // saldo = saldo - valor
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	// método que devolve/informa o saldo, que é private
	public double getSaldo() { // pega o saldo (método getter) - não precisa do "setter" porque não iremos modificar o saldo: transfere e saca já fazem esse papel.
		return this.saldo;
	}
}
