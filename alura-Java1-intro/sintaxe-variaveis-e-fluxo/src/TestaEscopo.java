
public class TestaEscopo {
	public static void main(String[] args) { // main + ctrl + espaço

		int idade = 16;
		int quantidadePessoas = 1;
		
		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Acompanhado? " + acompanhado);
		if (idade >= 18 || acompanhado) { // if é uma expressão booleana
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
	}
}
