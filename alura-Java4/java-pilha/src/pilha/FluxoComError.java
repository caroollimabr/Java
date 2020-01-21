package pilha;

public class FluxoComError {
	public static void main(String[] args) {
		System.out.println("In�cio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) { //ArithmeticException e NullPointerException s�o primeiras classes de exce��es, herdam de Exception e Throwable (UNCHECKED)
			String msg = ex.getMessage(); 
			System.out.println("Exception " + msg);
			ex.printStackTrace(); //mostra o rastro da pilha
		} 
		
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("In�cio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2(){
		System.out.println("In�cio do metodo2");
		metodo2();
		System.out.println("Fim do metodo2");
		//StackOverflowError: M�todo 2 fica se chamando at� n ter mais espa�o na pilha - Segunda classe de exce��o (m�quina virtual), que herda de Error e Throwable (CHECKED)
		
//a exce��o � uma classe que est� no HEAP (mem�ria de objetos) - e um obj foi criado aqui
		
		throw new ArithmeticException ("n�o deu certo"); //THROW: arremessa o obj na pilha de execu��o (mas ele tb sai do c�digo)
		
		//System.out.println("Fim do metodo2");
	}
}
