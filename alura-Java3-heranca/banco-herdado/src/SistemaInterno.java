
//Sistema interno da empresa

public class SistemaInterno {
	
	private int senha = 2222;


	//métodos
	public void autentica (Autenticavel fa) {//precisa ser do tipo FuncionarioAutenticavel
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Nao pode entrar no sistema");
		}
		
	
	}
	
}
