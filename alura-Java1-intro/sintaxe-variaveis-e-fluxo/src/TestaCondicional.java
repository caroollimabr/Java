//para formatar: ctrl + shift + f --OU-- Source, Format
//dois cliques em uma aba: maximizar
public class TestaCondicional {

	public static void main(String[] args) { // main + ctrl + espa�o
		System.out.println("Testando condicionais");// sysout + ctrl + espa�o
		int idade = 16;
		int quantidadePessoas = 1;

		if (idade >= 18) { // use as chaves independente de uma ou mais linhas para melhor visualiza��o
			System.out.println("Voc� � maior de idade.");
			System.out.println("Seja bem-vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� � menor de idade, mas est� acompanhado. Sejam bem-vindos!");
			} else {
			System.out.println("Voc� � menor de idade. Infelizmente voc� n�o pode entrar.");
			}
		}
	}

}
