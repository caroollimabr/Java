package pilha;
//criando a minha pr�pria exce��o
//Posso cri�-la herdando duas categorias de exce��o (de dentro do Java):
//1. RuntimeException: unchecked (n�o verificado pelo complador - tanto faz usar throws)
//2. Exception: checked (pede assinatura do m�todo (THROWS) - verificada pelo compilador)
public class MinhaExcecao extends Exception {
	public MinhaExcecao(String msg) {
        super(msg);
	}
}
