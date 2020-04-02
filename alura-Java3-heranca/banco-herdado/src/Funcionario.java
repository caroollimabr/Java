//Criação da classe e seus atributos
//ABSTRACT: conceito abstrato, relacionado a herança. Pode ser usado tanto antes de classe, quanto método
//Eliminamos a possibilidade de criação de um obj Funcionario.
//Classes abstratas não são instanciadas. Para instanciar, criamos uma classe filha não abstrata.
public abstract class Funcionario { // super class ou classe mãe(gerente herda atributos dela)
	private String nome;
	private String cpf;
	private double salario; // PROTECTED: informação é compartilhada somente entre seus filhos, ou herdeiros

//métodos
	public abstract double getBonificacao(); // assinatura do método: público, devolve um double e não recebe parâmetros
	// Método getBonificacao() só será implementado nas //classes filhas, mas
	// precisa existir na super class
//ABSTRACT Pode ser usado tanto antes de classe, quanto método

	
	
//Criação getters e setters (botão direito - source - generate getters and setters)
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
