//Cria��o da classe e seus atributos
//ABSTRACT: conceito abstrato, relacionado a heran�a. Pode ser usado tanto antes de classe, quanto m�todo
//Eliminamos a possibilidade de cria��o de um obj Funcionario.
//Classes abstratas n�o s�o instanciadas. Para instanciar, criamos uma classe filha n�o abstrata.
public abstract class Funcionario { // super class ou classe m�e(gerente herda atributos dela)
	private String nome;
	private String cpf;
	private double salario; // PROTECTED: informa��o � compartilhada somente entre seus filhos, ou herdeiros

//m�todos
	public abstract double getBonificacao(); // assinatura do m�todo: p�blico, devolve um double e n�o recebe par�metros
	// M�todo getBonificacao() s� ser� implementado nas //classes filhas, mas
	// precisa existir na super class
//ABSTRACT Pode ser usado tanto antes de classe, quanto m�todo

	
	
//Cria��o getters e setters (bot�o direito - source - generate getters and setters)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
