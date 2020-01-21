package pilha;
//PILHA DE EXECU��O/STACK (um dentro do outro): organiza execu��o do c�digo
public class Fluxo {
	public static void main(String[] args) {
		System.out.println("In�cio do main");
		// A exce��o muda o fluxo de execu��o do programa, encerrando-o.
		// ArithmeticException/0
		// TRY serve para tentar executar o problema mesmo assim
		try {
			metodo1();
		} catch (Exception ex) { // CATCH pede para capturar o problema/ EX � uma refer�ncia (MULTICATCH (v�rios catch, ou aqui separado por |): pode ser um ou outro problema ou outro...)
			String msg = ex.getMessage(); //recebe a msg do problema
			System.out.println("Exception " + msg);
			ex.printStackTrace(); //mostra o rastro da pilha
		}

		// TRYCATCH precisa ser tratada antecipadamente com um bloco espec�fico E S� EXECUTA QUANDO TEM EXCE��O MESMO!
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("In�cio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	//Duas categorias de exce��o (do Java):
	//1. RuntimeException: unchecked (n�o verificado pelo complador - tanto faz usar throws)
	//2. Exception: checked (pede assinatura do m�todo (THROWS) - verificada pelo compilador)
	private static void metodo2() throws MinhaExcecao {
		System.out.println("In�cio do metodo2");
		
		throw new NullPointerException("Deu muito errado");
		
		//System.out.println("Fim do metodo2");
	}
}

//private: acessa s� dentro da classe a n ser que tenha getter e setter (+ comum)
//protected: compartilhada apenas entre classes filhas
//abstract (pode ser usada em metodo e classe): existe para colocar atributos em comum de classes (classe Funcionario que engloba Designer, Gerente, Secretario, etc)
//static: atributo � da classe e n�o s� do objeto; m�todo que n�o tem uma refer�ncia em m�os ou um objeto criado � chamado pelo static. M�todos est�ticos acessam apenas atributos est�ticos
//Composi��o: aproveitamento de atributos (ex. private Cliente titular;)
//Heran�a (s� pode 1): classes do mesmo grupo (
//Interface (pode + de 1, s� define m�todos e n�o os implementa): classes diferentes que t�m algo em comum (Cliente e Gerente implements Autenticavel porque ambos t�m senha para acesso restrito)
//Construtor: inicializa dados e recebe par�metros
//getters and setters: btn direito-source-generate getters and setters
//GETTER: m�todo que devolve/informa
//SETTER: modifica/atribui 
//@Override (btn direito-source-override/implement methods): anota��o que faz um m�todo parar e recome�ar da forma que vc solicitou abaixo 
