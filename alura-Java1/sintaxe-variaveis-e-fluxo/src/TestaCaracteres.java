
public class TestaCaracteres {
	
	public static void main (String[] args) {
		char letra = 'a'; //char s� aceita UM caractere; aspas simples
		System.out.println(letra);
		
		char valor = 66; 
		System.out.println(valor); // imprime letra equivalente ao unicode: B
		
		
		valor = (char) (valor + 1); //vai dar C
		System.out.println(valor);
		
		String frase = "Ol�, estou testando."; //String mai�sculo e aspas duplas
		System.out.println(frase);
		
		frase = frase + 2020;
		System.out.println(frase);
	}

}
