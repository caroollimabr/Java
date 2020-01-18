//+ comum: Composi��o: apenas reutiliza��o de c�digo;
//Heran�a (extends): atributos e m�todos em comum
//+ comum: Interface (implements): rela��o entre classes bem diferentes que t�m algo em comum (cliente e gerente)


public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador; //Composi��o: classes independentes que se relacionam
	
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