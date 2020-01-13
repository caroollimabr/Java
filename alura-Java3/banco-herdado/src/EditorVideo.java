
public class EditorVideo extends Funcionario {
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do EDITOR DE VÍDEO");
		return super.getBonificacao() + 100;
	}
}
