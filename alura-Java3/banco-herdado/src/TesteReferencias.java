
public class TesteReferencias {
	public static void main(String[] args) {
		
		/*POLIMORFISMO: Gerente possui duas formas:
		 * Funcionario g1 = new Gerente(); -- refer�ncia mais gen�rica (ele � funcion�rio)
		 * OU
		 * Gerente g1 = new Gerente(); -- ref. mais espec�fica (ele � gerente)
		 * 
		 * Quando o c�digo � executado, o m�todo espec�fico sempre ser� chamado (vantagem polimorfismo)
		 */
		Gerente g1 = new Gerente(); //decl. vari�vel = new objeto();
		g1.setNome("Fulano");
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
	}
}
