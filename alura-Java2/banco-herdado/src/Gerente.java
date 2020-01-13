//Criação da classe e seus atributos
public class Gerente extends Funcionario { /*
											 * HERANÇA: a classe gerente herda todos os atributos da classe Funcionario
											 * Gerente (classe filha) é um funcionário.
											 */

	private int senha; // atributo é iniciado com valor 0

	// getters and setters

	@Override // suspende um método automático
	public double getBonificacao() { // reescrita da mesma assinatura do método de Funcionario
		System.out.println("Chamando o método bonificação do GERENTE");
		return super.getBonificacao() + super.getSalario(); // SUPER: salário vem da super class
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
