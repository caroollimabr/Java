
public class TesteReferencias {
	public static void main(String[] args) {
		
		/*POLIMORFISMO: Gerente possui duas formas:
		 * Funcionario g1 = new Gerente(); -- referência mais genérica (ele é funcionário)
		 * OU
		 * Gerente g1 = new Gerente(); -- ref. mais específica (ele é gerente)
		 * 
		 * Quando o código é executado, o método específico sempre será chamado (vantagem polimorfismo)
		 */
		Gerente g1 = new Gerente(); //decl. variável = new objeto();
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
