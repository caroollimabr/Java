package banco;

public class CriaConta { // Classe � uma especifica��o de um tipo, definindo atributos e comportamentos
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // objeto (primeiraConta): inst�ncia de uma classe onde podemos definir valores para seus atributos. Devemos referenci�-la em outras classes quando formos utiliz�-las por l�.
		primeiraConta.saldo = 200; // atributo (saldo): caracter�stica que especifica uma classe
		System.out.println(primeiraConta.saldo); // mostra o saldo

		primeiraConta.saldo += 100; // primeiraConta.saldo = primeiraConta.saldo + 100
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();// cria novo objeto
		segundaConta.saldo = 300;

		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);

		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);

		System.out.println(segundaConta.agencia);

		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta est� na ag�ncia " + segundaConta.agencia);

		if (primeiraConta == segundaConta) { // == compara refer�ncias, e n�o objetos.
			System.out.println("Mesma conta.");
		} else {
			System.out.println("Contas diferentes.");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta); // ids diferentes, refer�ncias orientadas para dois objetos diferentes
	}
}
