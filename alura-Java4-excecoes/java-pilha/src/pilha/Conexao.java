package pilha;
//TRY CATCH MAIS ENXUTO COM AUTOCLOSEABLE
public class Conexao implements AutoCloseable{ //AutoCloseable exige que haja o método close()

	public Conexao() {
		System.out.println("Abrindo conexão");
		throw new IllegalStateException(); //Se chamar o construtor, uma exceção será jogada, obj nunca será criado e n será inicializada uma referência -- comentar para deixar o método menos perigoso
	}
	
	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException(); //Estende de RuntimeException (UNCHECKED)
	}
	
	public void close() {
		System.out.println("Fechando conexão");
	}
}
