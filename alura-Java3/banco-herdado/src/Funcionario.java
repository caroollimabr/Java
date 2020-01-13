//Criação da classe e seus atributos
public class Funcionario { //super class ou classe mãe(gerente herda atributos dela)
	private String nome;
	private String cpf;
	private double salario; // PROTECTED: informação é compartilhada somente entre seus filhos, ou herdeiros

//Construtor
	public Funcionario() {
		
	}
	
//métodos
	public double getBonificacao() { //assinatura do método: público, devolve um double e não recebe parâmetros
		return this.salario * 0.05; //10% do salário
	}
	
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
