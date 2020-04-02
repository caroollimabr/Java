
public class Conta {
	// atributos (semelhantes ao var)
	private double saldo = 100; // se vc n�o especificar, todas os saldos ter�o esse valor ---- ATRIBUTO
								// PRIVADO: n�o pode ser lido ou modificado fora da classe (ENCAPSULAMENTO). O
								// comum � que todos os atributos sejam privados.
	int agencia;
	int numero;
	Cliente titular; /*COMPOSI��O: tipo Cliente porque � atributo da classe Cliente

	Cliente titular = new Cliente(); ---- Toda a vez que o new � acionado para uma Conta, temos um novo Cliente (nao faremos neste projeto porque toda conta deve ser associada a um novo cliente (um cliente n�o pode ter duas contas,por ex.)
	*/
	/*
	 * String cpf; String profissao; ---- classe come�a a ficar cheia de infos que
	 * n�o t�m exatamente a ver com uma conta banc�ria, como profiss�o e CPF (vamos
	 * criar um novo projeto com essas informa��es.
	 */

	// metodos
	void deposita(double valor) { // deposita � um m�todo ("parecido c fun��o") / se a fun��o for vazia, usar void
		this.saldo = this.saldo + valor; // valor � um argumento, saldo � vari�vel, por isso coloca-se this (� opcional, mas recomendado)

	}

	public boolean saca(double valor) { // m�todo p�blic tipo boolean
		if (this.saldo >= valor) {
			this.saldo -= valor; // saldo = saldo - valor
			return true; // return para a execu��o do m�todo e retorna para quem est� chamando
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) { // v�rgula a cada argumento
		if (this.saldo >= valor) {
			this.saldo -= valor; // saldo = saldo - valor
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	// m�todo que devolve/informa o saldo, que � private
	public double getSaldo() { // pega o saldo (m�todo getter) - n�o precisa do "setter" porque n�o iremos modificar o saldo: transfere e saca j� fazem esse papel.
		return this.saldo;
	}
}
