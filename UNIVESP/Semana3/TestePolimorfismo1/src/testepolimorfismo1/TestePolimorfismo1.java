package testepolimorfismo1;

// Polimorfismo: sobrecarga de método utilizando diferentes tipos de argumentos
class Multiplicacao {

	// Método com 2 parâmetros
	static int Multiplica(int a, int b)
	{
		return a * b;
	}

	// Método com o mesmo nome do anterior, mas com dois parâmetros double
	static double Multiplica(double a, double b)
	{
		return a * b;
	}
}

class TestePolimorfismo1 {
	public static void main(String[] args)
	{
		System.out.println(Multiplicacao.Multiplica(9,9));
		System.out.println(Multiplicacao.Multiplica(1.1,1.1));
	}
}
