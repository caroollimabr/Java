package banco;

public class CriaConta { // Classe é uma especificação de um tipo, definindo atributos e comportamentos
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // objeto (primeiraConta): instância de uma classe onde podemos definir valores para seus atributos. Devemos referenciá-la em outras classes quando formos utilizá-las por lá.
		primeiraConta.saldo = 200; // atributo (saldo): característica que especifica uma classe
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
		System.out.println("Agora a segunda conta está na agência " + segundaConta.agencia);

		if (primeiraConta == segundaConta) { // == compara referências, e não objetos.
			System.out.println("Mesma conta.");
		} else {
			System.out.println("Contas diferentes.");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta); // ids diferentes, referências orientadas para dois objetos diferentes
	}
}
