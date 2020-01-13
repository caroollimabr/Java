//Os atributos e métodos são herdados, os construtores não são (pertencem à sua classe, apenas).
public class ContaCorrente extends Conta {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); /* busca o construtor padrão da super class se não houver parâmetros, busca o customizado se houver parâmetros iguais aos do construtor da super class */
	}

	@Override //anotação para o compilador: para o método automático e dá a opção de reescrevê-lo
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
}
