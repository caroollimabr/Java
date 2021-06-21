package exemplostream2;

// Ilustra a utilização do método BufferedInputStream read()

import java.io.*; 

public class ExemploStream2 { 
	public static void main(String[] args) 
		throws Exception 
	{ 

		// Cria um inputstream para ler o conteúdo do arquivo
		FileInputStream inputStream 
			= new FileInputStream("C://Users//julio//entrada.txt"); 

		// Converte inputStream para bufferedInputStream 
		BufferedInputStream buffInputStr 
			= new BufferedInputStream( 
				inputStream); 

		// Leia até que um byte esteja disponível 
		while (buffInputStr.available() > 0) { 

			// Lê o byte e converte o inteiro para caracter
			char c = (char)buffInputStr.read(); 

			// Imprime os caracteres
			System.out.println("Caractere : " + c); 
		} 
	} 
} 

