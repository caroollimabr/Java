
public class TestaFor {

	public static void main(String[] args) {
		for(int contador = 0; contador <= 10 ; contador++) {
			System.out.println(contador);
		}
		
		//Aqui, n�o ir� funcionar colocar o 
		//System.out.println(contador);
		//A vari�vel est� dentro do escopo do for.
	}
}
