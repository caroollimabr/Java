package pilha;
//PILHA DE EXECUÇÃO/STACK (um dentro do outro): organiza execução do código
public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Início do main");
		// A exceção muda o fluxo de execução do programa, encerrando-o.
		// ArithmeticException/0
		// TRY serve para tentar executar o problema mesmo assim
		try {
			metodo1();
		} catch (Exception ex) { // CATCH pede para capturar o problema/ EX é uma referência (MULTICATCH (vários catch, ou aqui separado por |): pode ser um ou outro problema ou outro...)
			String msg = ex.getMessage(); //recebe a msg do problema
			System.out.println("Exception " + msg);
			ex.printStackTrace(); //mostra o rastro da pilha
		}

		// TRYCATCH precisa ser tratada antecipadamente com um bloco específico E SÓ EXECUTA QUANDO TEM EXCEÇÃO MESMO!
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Início do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	//Duas categorias de exceção (do Java):
	//1. RuntimeException: unchecked (não verificado pelo complador - tanto faz usar throws)
	//2. Exception: checked (pede assinatura do método (THROWS) - verificada pelo compilador)
	private static void metodo2() throws MinhaExcecao {
		System.out.println("Início do metodo2");
		
		throw new NullPointerException("Deu muito errado");
		
		//System.out.println("Fim do metodo2");
	}
}

//private: acessa só dentro da classe a n ser que tenha getter e setter (+ comum)
//protected: compartilhada apenas entre classes filhas
//abstract (pode ser usada em metodo e classe): existe para colocar atributos em comum de classes (classe Funcionario que engloba Designer, Gerente, Secretario, etc)
//static: atributo é da classe e não só do objeto; método que não tem uma referência em mãos ou um objeto criado é chamado pelo static. Métodos estáticos acessam apenas atributos estáticos
//Composição: aproveitamento de atributos (ex. private Cliente titular;)
//Herança (só pode 1): classes do mesmo grupo (
//Interface (pode + de 1, só define métodos e não os implementa): classes diferentes que têm algo em comum (Cliente e Gerente implements Autenticavel porque ambos têm senha para acesso restrito)
//Construtor: inicializa dados e recebe parâmetros
//getters and setters: btn direito-source-generate getters and setters
//GETTER: método que devolve/informa
//SETTER: modifica/atribui 
//@Override (btn direito-source-override/implement methods): anotação que faz um método parar e recomeçar da forma que vc solicitou abaixo 
