package banco;

public class Conta {
	//atributos (semelhantes ao var)
	double saldo;
	int agencia = 42; //se vc não especificar, todas as contas serão dessa agência
	int numero;
	String titular;
	/*String cpf;
	String profissao;  ---- classe começa a ficar cheia de infos que não têm exatamente a ver com uma conta bancária, como profissão e CPF (vamos criar um novo projeto com essas informações.*/
	
	//métodos
	void deposita(double valor) { //deposita é um método ("parecido c função") / se a função for vazia, usar void
		this.saldo = this.saldo + valor; //valor é um argumento, saldo é variável, por isso coloca-se this (é opcional, mas recomendado)
	}
	public boolean saca(double valor) { //método públic tipo boolean
		if (this.saldo >= valor) {
			this.saldo -= valor; //saldo = saldo - valor
			return true; //return para a execução do método e retorna para quem está chamando
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) { //vírgula a cada argumento
		if(this.saldo >= valor) {
			this.saldo -=valor; //saldo = saldo - valor
			destino.deposita(valor); 
			return true;
		} else {
			return false;
		}
	}
}
