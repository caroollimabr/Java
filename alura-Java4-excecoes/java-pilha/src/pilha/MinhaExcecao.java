package pilha;
//criando a minha própria exceção
//Posso criá-la herdando duas categorias de exceção (de dentro do Java):
//1. RuntimeException: unchecked (não verificado pelo complador - tanto faz usar throws)
//2. Exception: checked (pede assinatura do método (THROWS) - verificada pelo compilador)
public class MinhaExcecao extends Exception {
	public MinhaExcecao(String msg) {
        super(msg);
	}
}
