package testeheranca;

// Aplicação dos conceitos de Herança
// Classe Base/Mãe
class Bicicleta {
	// atributos
	public int disco;
	public int velocidade;

	// Construtor da classe Base
	public Bicicleta(int disco, int velocidade)
	{
		this.disco = disco;
		this.velocidade = velocidade;
	}

	// Métodos
	public void diminuiVelocidade(int diminui)
	{
		velocidade -= diminui;
	}

	public void aumentaVelocidade(int aumenta)
	{
		velocidade += aumenta;
	}

	public String toString()
	{
		return ("Tamanho do disco da bicicleta é: " + disco + " polegadas \n" + "e a velocidade é " + velocidade + "km/h");
	}
}

// Classe Derivada/Filha
class MountainBike extends Bicicleta {

	// Atributo específico desta classe
	public int altAssento;

	// Construtor
	public MountainBike(int disco, int velocidade, int startAltura)
	{
		// invocação do construtor da classe base (Bicicleta)
		super(disco, velocidade);
		altAssento = startAltura;
	}

	// Método específico da subclasse
	public void setaAltura(int valor)
	{
		altAssento = valor;
	}

	// overriding o método toString() de Bicicleta, a fim de escrever mais informações
	@Override public String toString()
	{
		return (super.toString() + "\n A alutura do assento é: " + altAssento + " cm");
	}
}

// Teste dos conceitos que envolvem Herança
public class TesteHeranca {
	public static void main(String args[])
	{
		MountainBike mb = new MountainBike(3, 100, 25);
		System.out.println(mb.toString());
	}
}
