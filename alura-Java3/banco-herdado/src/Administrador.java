//+ comum: Composição: apenas reutilização de código;
//Herança (extends): atributos e métodos em comum
//+ comum: Interface (implements): relação entre classes bem diferentes que têm algo em comum (cliente e gerente)


public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador; //Composição: classes independentes que se relacionam
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override //sobrescreve bonificacao funcionario
	public double getBonificacao() {
		return 50;
	}

	@Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
    	return this.autenticador.autentica(senha);
    }

} 