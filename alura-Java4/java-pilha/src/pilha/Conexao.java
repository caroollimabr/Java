package pilha;
//TRY CATCH MAIS ENXUTO COM AUTOCLOSEABLE
public class Conexao implements AutoCloseable{ //AutoCloseable exige que haja o m�todo close()

	public Conexao() {
		System.out.println("Abrindo conex�o");
		throw new IllegalStateException(); //Se chamar o construtor, uma exce��o ser� jogada, obj nunca ser� criado e n ser� inicializada uma refer�ncia -- comentar para deixar o m�todo menos perigoso
	}
	
	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException(); //Estende de RuntimeException (UNCHECKED)
	}
	
	public void close() {
		System.out.println("Fechando conex�o");
	}
}
