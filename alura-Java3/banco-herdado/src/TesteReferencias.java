
public class TesteReferencias {
	public static void main(String[] args) {
		
		/*POLIMORFISMO: Gerente possui duas formas:
		 * Funcionario g1 = new Gerente(); -- refer�ncia mais gen�rica (ele � funcion�rio)
		 * OU
		 * Gerente g1 = new Gerente(); -- ref. mais espec�fica (ele � gerente)
		 * 
		 * Quando o c�digo � executado, o m�todo espec�fico sempre ser� chamado (vantagem polimorfismo)
		 */
		Gerente g = new Gerente(); //decl. vari�vel = new objeto();
		g.setNome("Fulano");
		g.setSalario(5000.0);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g);
		controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
	}
}
