//ABSTRACT: classe não vai ser usada diretamente, mas as //outras vão pegar métodos, construtor e atributos dela (abstract pode //ser usado em métodos tb)


public abstract class Conta {
	// atributos (semelhantes ao var)
	protected double saldo; //nesse caso, protected liberou o atributo para os filhos
	/*
	 * se vc não especificar, todas os saldos terão esse valor ---- ATRIBUTO
	 * PRIVADO: não pode ser lido ou modificado fora da classe (ENCAPSULAMENTO). O
	 * comum é que todos os atributos sejam privados. Assim, vc se previne de
	 * mudanças de privacidade futuras
	 */
	private int agencia;
	private int numero;
	private Cliente titular; /* COMPOSIÇÃO: tipo Cliente porque é atributo da classe Cliente */
	private static int total = 0; // static: o atributo é da classe, e não só do objeto.

	public Conta(int agencia, int numero) {// construtor: oferece a possibilidade de inicializar alguns dados e receber
// parâmetros
		Conta.total++; //Conta.total = ela mesma + 1
		// System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		// System.out.println("Estou criando uma conta " + this.numero);
	}

	// método deposita: ABSTRACT (não pode ter implementação)
	public abstract void deposita(double valor); // valor é um argumento, saldo é variável, por isso coloca-se this (é opcional,
// mas recomendado)


	// metodo saca
	public void saca(double valor) throws SaldoInsuficienteException { // método public tipo boolean
		if (this.saldo >= valor) {
			this.saldo -= valor; // saldo = saldo - valor
			throw new SaldoInsuficienteException("Saldo " + this.saldo + ", Valor: " + valor);
		} 
		
		this.saldo -= valor;//saldo = saldo - valor
	}

	// método transfere
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	// GETTER: método que devolve/informa o saldo, que é private
	public double getSaldo() { // pega o saldo (método getter)
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	// SETTER: modifica/atribui o numero --- não precisa do "setter" de saldo porque
	// não iremos modificar o saldo: transfere e saca já fazem esse papel.
	public void setNumero(int numero) {
		if (numero <= 0) { // proteção valores negativos
			System.out.println("Não pode valor <= 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) { // proteção valores negativos
			System.out.println("Não pode valor menor ou igual a 0");
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

	public static int getTotal() { // métodos estáticos acessam apenas atributos estáticos
		return Conta.total;
	}

}
