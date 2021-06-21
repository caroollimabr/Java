package animal;

// Declaracao da Classe
public class Animal {
	// Variáveis da instância
	String nome;
	int idade;
	String cor;

	// Declaracao do Construtor da Classe
	public Animal(String nome, int idade, String cor)
	{
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome()
	{
		return nome;
	}

	// Método 2
	public int getIdade()
	{
		return idade;
	}

	// Método 3
	public String getCor()
	{
		return cor;
	}

	public static void main(String[] args) {
		// Criação de objetos da classe Animal
		Animal pingo = new Animal("Pingo", 5, "preto/branco");
		Animal zebra = new Animal("Zebrinha", 15, "preto/branco");

		// Acessa os dados do objeto por meio de referência
		System.out.println(pingo.getNome());
		System.out.println(pingo.getIdade());
        System.out.println(pingo.getCor());
                
		// Acessa os dados do objeto por meio de referência
		System.out.println(zebra.getNome());
		System.out.println(zebra.getIdade());
		System.out.println(zebra.getCor());
	}
}