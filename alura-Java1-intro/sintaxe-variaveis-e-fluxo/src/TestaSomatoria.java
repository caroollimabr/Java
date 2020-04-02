
public class TestaSomatoria {
	
	public static void main (String[] args) {
		int contador = 0;
		int total = 0;
		
		while (contador <= 10) {
			total += contador;
			contador ++;
			//herança do C: contador = contador + 1;
			//OU ++contador;
			//OU contador += 1;
		}
		System.out.println(total);
	}
}
