
public class Conta {
	// atributos (semelhantes ao var)
	private double saldo; 
	/*
	 * se vc n�o especificar, todas os saldos ter�o esse valor ---- ATRIBUTO
	 * PRIVADO: n�o pode ser lido ou modificado fora da classe (ENCAPSULAMENTO). O
	 * comum � que todos os atributos sejam privados. Assim, vc se previne de
	 * mudan�as de privacidade futuras
	 */
	private int agencia;
	private int numero;
	private Cliente titular; /* COMPOSI��O: tipo Cliente porque � atributo da classe Cliente */
	private static int total = 0; // static: o atributo � da classe, e n�o s� do objeto.

	public Conta(int agencia, int numero) {// construtor: oferece a possibilidade de inicializar alguns dados e receber
											// par�metros
		Conta.total++;
		// System.out.println("O total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		// System.out.println("Estou criando uma conta " + this.numero);
	}

	// m�todo deposita
	public void deposita(double valor) {
		this.saldo = this.saldo + valor; // valor � um argumento, saldo � vari�vel, por isso coloca-se this (� opcional,
											// mas recomendado)

	}

	// metodo saca
	public boolean saca(double valor) { // m�todo public tipo boolean
		if (this.saldo >= valor) {
			this.saldo -= valor; // saldo = saldo - valor
			return true; // return para a execu��o do m�todo e retorna para quem est� chamando
		} else {
			return false;
		}
	}

	// m�todo transfere
	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	// GETTER: m�todo que devolve/informa o saldo, que � private
	public double getSaldo() { // pega o saldo (m�todo getter)
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	// SETTER: modifica/atribui o numero --- n�o precisa do "setter" de saldo porque
	// n�o iremos modificar o saldo: transfere e saca j� fazem esse papel.
	public void setNumero(int numero) {
		if (numero <= 0) { // prote��o valores negativos
			System.out.println("N�o pode valor <= 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) { // prote��o valores negativos
			System.out.println("N�o pode valor menor ou igual a 0");
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() { // m�todos est�ticos acessam apenas atributos est�ticos
		return Conta.total;
	}

}
