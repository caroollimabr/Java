
public class Fatorial {
	
	public static void main(String[] args) {
		int fatorial = 1;
		for (int numero = 1; numero <= 10; numero++) {
			fatorial *= numero; // fatorial = fatorial * numero
			System.out.println("O fatorial de " + numero + " � " + fatorial + "." );
		}
	}

}
