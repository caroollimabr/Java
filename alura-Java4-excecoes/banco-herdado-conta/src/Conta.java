//ABSTRACT: classe n�o vai ser usada diretamente, mas as //outras v�o pegar m�todos, construtor e atributos dela (abstract pode //ser usado em m�todos tb)


public abstract class Conta {
	// atributos (semelhantes ao var)
	protected double saldo; //nesse caso, protected liberou o atributo para os filhos
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
		Conta.total++; //Conta.total = ela mesma + 1
		// System.out.println("O total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		// System.out.println("Estou criando uma conta " + this.numero);
	}

	// m�todo deposita: ABSTRACT (n�o pode ter implementa��o)
	public abstract void deposita(double valor); // valor � um argumento, saldo � vari�vel, por isso coloca-se this (� opcional,
// mas recomendado)


	// metodo saca
	public void saca(double valor) throws SaldoInsuficienteException { // m�todo public tipo boolean
		if (this.saldo >= valor) {
			this.saldo -= valor; // saldo = saldo - valor
			throw new SaldoInsuficienteException("Saldo " + this.saldo + ", Valor: " + valor);
		} 
		
		this.saldo -= valor;//saldo = saldo - valor
	}

	// m�todo transfere
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
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
			return;
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
