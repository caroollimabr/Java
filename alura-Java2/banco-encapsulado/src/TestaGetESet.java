
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(0, 0);
		//conta.numero = 1337; (não dá, privado)
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente carolina = new Cliente();
		carolina.setNome("Carolina Lima");
		
		conta.setTitular(carolina);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programadora");
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programadora");
		
		System.out.println(titularDaConta);
		System.out.println(carolina);
		System.out.println(conta.getTitular()); //está tudo no mesmo endereço de memória
	}
}
