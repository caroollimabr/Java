//HERANCA MULTIPLA: Gerente é um funcionário que precisa de senha
//em Java, heranca multipla é resolvida com INTERFACE
//Criação da classe e seus atributos
public class Gerente extends Funcionario implements Autenticavel { /*
											 * HERANÇA: a classe gerente herda todos os atributos da classe Funcionario
											 * Gerente (classe filha) é um funcionário.
											 */
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	

	public double getBonificacao() { // reescrita da mesma assinatura do método de Funcionario
		System.out.println("Chamando o método bonificação do GERENTE");
		return super.getSalario(); // SUPER: salário vem da super class
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
