package banco;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); //refer�ncia de um objeto: Devemos inser�-la em outras classes caso queiramos lig�-la a outras classes.
		primeiraConta.saldo = 300;

		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;// duas refer�ncias para o mesmo objeto: s�o diferentes, mas possuem o mesmo destino (objeto)
		
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;//segundaConta.saldo = segundaConta.Saldo + 100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("� a mesma conta.");
		}
		
		System.out.println(primeiraConta); //refer�ncia a um  objeto que est� na "gaveta de mem�ria" identificada por essa sequ�ncia num�rica
		
		System.out.println(segundaConta);//mesmo id: duas refer�ncias apontando para o mesmo obj
		
	}
}
