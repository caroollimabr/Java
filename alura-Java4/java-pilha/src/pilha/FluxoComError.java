package pilha;

public class FluxoComError {
	public static void main(String[] args) {
		System.out.println("Início do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) { //ArithmeticException e NullPointerException são primeiras classes de exceções, herdam de Exception e Throwable (UNCHECKED)
			String msg = ex.getMessage(); 
			System.out.println("Exception " + msg);
			ex.printStackTrace(); //mostra o rastro da pilha
		} 
		
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Início do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2(){
		System.out.println("Início do metodo2");
		metodo2();
		System.out.println("Fim do metodo2");
		//StackOverflowError: Método 2 fica se chamando até n ter mais espaço na pilha - Segunda classe de exceção (máquina virtual), que herda de Error e Throwable (CHECKED)
		
//a exceção é uma classe que está no HEAP (memória de objetos) - e um obj foi criado aqui
		
		throw new ArithmeticException ("não deu certo"); //THROW: arremessa o obj na pilha de execução (mas ele tb sai do código)
		
		//System.out.println("Fim do metodo2");
	}
}
