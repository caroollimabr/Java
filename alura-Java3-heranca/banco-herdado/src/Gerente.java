//HERANCA MULTIPLA: Gerente � um funcion�rio que precisa de senha
//em Java, heranca multipla � resolvida com INTERFACE
//Cria��o da classe e seus atributos
public class Gerente extends Funcionario implements Autenticavel { /*
											 * HERAN�A: a classe gerente herda todos os atributos da classe Funcionario
											 * Gerente (classe filha) � um funcion�rio.
											 */
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	

	public double getBonificacao() { // reescrita da mesma assinatura do m�todo de Funcionario
		System.out.println("Chamando o m�todo bonifica��o do GERENTE");
		return super.getSalario(); // SUPER: sal�rio vem da super class
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
