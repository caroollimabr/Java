
public class TestaCondicional2 {
	public static void main(String[] args) { // main + ctrl + espa�o
		System.out.println("Testando condicionais");// sysout + ctrl + espa�o
		int idade = 16;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 2; // s� pode ser true ou false pelo tipo ser boolean
		
		System.out.println("Acompanhado? " + acompanhado);
		if (idade >= 18 || acompanhado) { //if � uma express�o booleana
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar.");
		}
	}
}
