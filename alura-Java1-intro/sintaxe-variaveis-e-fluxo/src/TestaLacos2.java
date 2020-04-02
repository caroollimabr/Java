
public class TestaLacos2 {
	public static void main (String[] args) {
		//para for, while e if, as chaves não são obrigatórias em caso de 1 statement
		for (int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna <= linha; coluna++) {
				/*
				 if(coluna > linha) 
					break; //break: para de executar o laço mais próximo (no caso)
				 */
				System.out.print("*");
			}
			System.out.println();//pula uma linha a cada ciclo do for central
		}
		//fim do for
	}
}
