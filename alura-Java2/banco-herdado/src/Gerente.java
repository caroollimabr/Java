//Cria��o da classe e seus atributos
public class Gerente extends Funcionario { /*
											 * HERAN�A: a classe gerente herda todos os atributos da classe Funcionario
											 * Gerente (classe filha) � um funcion�rio.
											 */

	private int senha; // atributo � iniciado com valor 0

	// getters and setters

	@Override // suspende um m�todo autom�tico
	public double getBonificacao() { // reescrita da mesma assinatura do m�todo de Funcionario
		System.out.println("Chamando o m�todo bonifica��o do GERENTE");
		return super.getBonificacao() + super.getSalario(); // SUPER: sal�rio vem da super class
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
