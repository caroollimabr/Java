
public class TestaWhile {
	public static void main(String[] args) {
		int contador = 0;
		// while, assim como o if, tamb�m recebe uma express�o booleana
		while (contador <= 10) {
			
			System.out.println(contador);
			contador ++;
			
			//heran�a do C: contador = contador + 1;
			//OU ++contador;
			//OU contador += 1;
		}
		//Como a vari�vel est� fora do escopo do while, faz o 11 aparecer
		System.out.println(contador);
	}
}
