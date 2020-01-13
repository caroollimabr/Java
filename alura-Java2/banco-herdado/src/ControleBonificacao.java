
public class ControleBonificacao {
	
	private double soma; //atributo para somar bonificações
	
	//método para registrar bonificação de funcionário
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}

	public double getSoma() {
		return soma;
	}
	
}
