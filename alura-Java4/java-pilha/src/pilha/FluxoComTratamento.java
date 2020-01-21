package pilha;

public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("In�cio do main");
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
		System.out.println("In�cio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("In�cio do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
			// Conta c = null;
			// c.deposita();

//a exce��o � uma classe que est� no HEAP (mem�ria de objetos) - e um obj foi criado aqui

			// throw new ArithmeticException ("n�o deu certo"); //THROW: arremessa o obj na
			// pilha de execu��o (mas ele tb sai do c�digo)
		}
		System.out.println("Fim do metodo2");
	}
}

// private: acessa s� dentro da classe a n ser que tenha getter e setter (+
// comum)
// protected: compartilhada apenas entre classes filhas
// abstract (pode ser usada em metodo e classe): existe para colocar atributos
// em comum de classes (classe Funcionario que engloba Designer, Gerente,
// Secretario, etc)
// static: atributo � da classe e n�o s� do objeto; m�todo que n�o tem uma
// refer�ncia em m�os ou um objeto criado � chamado pelo static. M�todos
// est�ticos acessam apenas atributos est�ticos
// Composi��o: aproveitamento de atributos (ex. private Cliente titular;)
// Heran�a (s� pode 1): classes do mesmo grupo (
// Interface (pode + de 1, s� define m�todos e n�o os implementa): classes
// diferentes que t�m algo em comum (Cliente e Gerente implements Autenticavel
// porque ambos t�m senha para acesso restrito)
// Construtor: inicializa dados e recebe par�metros
// getters and setters: btn direito-source-generate getters and setters
// GETTER: m�todo que devolve/informa
// SETTER: modifica/atribui
// @Override (btn direito-source-override/implement methods): anota��o que faz
// um m�todo parar e recome�ar da forma que vc solicitou abaixo
// TRY/CATCH: (try) desencoraja o programa a encerrar por uma exce��o e pega
// (catch - pode ter v�rios) o problema - precisa ser executada antes do bloco
// de exce��o
//ex.printStackTrace(); -- mostra o rastro da pilha
