//Cria��o da classe e seus atributos
public class Funcionario { //super class ou classe m�e(gerente herda atributos dela)
	private String nome;
	private String cpf;
	private double salario; // PROTECTED: informa��o � compartilhada somente entre seus filhos, ou herdeiros

//Construtor
	public Funcionario() {
		
	}
	
//m�todos
	public double getBonificacao() { //assinatura do m�todo: p�blico, devolve um double e n�o recebe par�metros
		return this.salario * 0.05; //10% do sal�rio
	}
	
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
