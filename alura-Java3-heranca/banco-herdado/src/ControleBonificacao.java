
public class ControleBonificacao {
	
	private double soma; //atributo para somar bonifica��es
	
	//m�todo para registrar bonifica��o de funcion�rio
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}

	public double getSoma() {
		return soma;
	}
	
}
