package pilha;

public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Início do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace(); // mostra o rastro da pilha
		}

		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Início do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Início do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
			// Conta c = null;
			// c.deposita();

//a exceção é uma classe que está no HEAP (memória de objetos) - e um obj foi criado aqui

			// throw new ArithmeticException ("não deu certo"); //THROW: arremessa o obj na
			// pilha de execução (mas ele tb sai do código)
		}
		System.out.println("Fim do metodo2");
	}
}

// private: acessa só dentro da classe a n ser que tenha getter e setter (+
// comum)
// protected: compartilhada apenas entre classes filhas
// abstract (pode ser usada em metodo e classe): existe para colocar atributos
// em comum de classes (classe Funcionario que engloba Designer, Gerente,
// Secretario, etc)
// static: atributo é da classe e não só do objeto; método que não tem uma
// referência em mãos ou um objeto criado é chamado pelo static. Métodos
// estáticos acessam apenas atributos estáticos
// Composição: aproveitamento de atributos (ex. private Cliente titular;)
// Herança (só pode 1): classes do mesmo grupo (
// Interface (pode + de 1, só define métodos e não os implementa): classes
// diferentes que têm algo em comum (Cliente e Gerente implements Autenticavel
// porque ambos têm senha para acesso restrito)
// Construtor: inicializa dados e recebe parâmetros
// getters and setters: btn direito-source-generate getters and setters
// GETTER: método que devolve/informa
// SETTER: modifica/atribui
// @Override (btn direito-source-override/implement methods): anotação que faz
// um método parar e recomeçar da forma que vc solicitou abaixo
// TRY/CATCH: (try) desencoraja o programa a encerrar por uma exceção e pega
// (catch - pode ter vários) o problema - precisa ser executada antes do bloco
// de exceção
//ex.printStackTrace(); -- mostra o rastro da pilha
