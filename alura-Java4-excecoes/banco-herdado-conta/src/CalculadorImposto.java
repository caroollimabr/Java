
public class CalculadorImposto {

	//Classes que implementaram a interface Tributavel podem ser utilizadas por este método:
	
	private double totalImposto;
	
	public void registra (Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor; //this.totalImposto = ele mesmo + valor
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
