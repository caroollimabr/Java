
public class TestaFor {

	public static void main(String[] args) {
		for(int contador = 0; contador <= 10 ; contador++) {
			System.out.println(contador);
		}
		
		//Aqui, não irá funcionar colocar o 
		//System.out.println(contador);
		//A variável está dentro do escopo do for.
	}
}
