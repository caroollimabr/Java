//IMPLEMENTS para interface e EXTENDS para heranca
//Uma classe pode herdar uma classe 
//Uma classe pode estar ligada a varias interfaces (..implements..,..)

public class Cliente implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	//Delega��o de chamada: m�todos do atributo senha existem, mas o atributo est� em outra classe (n�o � mais concreto)
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
