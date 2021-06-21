package cachorro;

// Conceito de classes e objetos

// Declaracao da Classe
public class Cachorro {
	// Variáveis da instância
	String nome;
	String raca;
	int idade;
	String cor;

	// Declaracao do Construtor da Classe
	public Cachorro(String nome, String raca, int idade, String cor)
	{
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome()
	{
		return nome;
	}

	// Método 2
	public String getRaca()
	{
		return raca;
	}

	// Método 3
	public int getIdade()
	{
		return idade;
	}

	// Método 4
	public String getCor()
	{
		return cor;
	}

	@Override
	public String toString()
	{
		return ("Eu sou " + this.getNome() + ".\n Minha raça, idade e cor são: " + this.getRaca() + ", " + this.getIdade() + ", " + this.getCor());
	}

	public static void main(String[] args)
	{
		Cachorro pingo = new Cachorro("Pingo", "shitzu", 5, "preto/branco");
		System.out.println(pingo.toString());
	}
}

