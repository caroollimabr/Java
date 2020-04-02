package banco;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); //referência de um objeto: Devemos inserí-la em outras classes caso queiramos ligá-la a outras classes.
		primeiraConta.saldo = 300;

		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;// duas referências para o mesmo objeto: são diferentes, mas possuem o mesmo destino (objeto)
		
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;//segundaConta.saldo = segundaConta.Saldo + 100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("É a mesma conta.");
		}
		
		System.out.println(primeiraConta); //referência a um  objeto que está na "gaveta de memória" identificada por essa sequência numérica
		
		System.out.println(segundaConta);//mesmo id: duas referências apontando para o mesmo obj
		
	}
}
