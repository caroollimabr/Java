package banco;

public class Conta {
	//atributos (semelhantes ao var)
	double saldo;
	int agencia = 42; //se vc n�o especificar, todas as contas ser�o dessa ag�ncia
	int numero;
	String titular;
	/*String cpf;
	String profissao;  ---- classe come�a a ficar cheia de infos que n�o t�m exatamente a ver com uma conta banc�ria, como profiss�o e CPF (vamos criar um novo projeto com essas informa��es.*/
	
	//m�todos
	void deposita(double valor) { //deposita � um m�todo ("parecido c fun��o") / se a fun��o for vazia, usar void
		this.saldo = this.saldo + valor; //valor � um argumento, saldo � vari�vel, por isso coloca-se this (� opcional, mas recomendado)
	}
	public boolean saca(double valor) { //m�todo p�blic tipo boolean
		if (this.saldo >= valor) {
			this.saldo -= valor; //saldo = saldo - valor
			return true; //return para a execu��o do m�todo e retorna para quem est� chamando
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) { //v�rgula a cada argumento
		if(this.saldo >= valor) {
			this.saldo -=valor; //saldo = saldo - valor
			destino.deposita(valor); 
			return true;
		} else {
			return false;
		}
	}
}
