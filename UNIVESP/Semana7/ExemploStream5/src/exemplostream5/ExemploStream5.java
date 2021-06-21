package exemplostream5;

// Exemplo para ilustrar o método BufferedWriter write(int)

import java.io.*; 

public class ExemploStream5 { 
	public static void main(String[] args) 
		throws IOException 
	{ 
		// Cria a string Writer 
		StringWriter stringWriter = new StringWriter(); 
		// Converte stringWriter para bufferedWriter 
		BufferedWriter buffWriter = new BufferedWriter(stringWriter);
                // Escreve "U" para o buffer writer 
		buffWriter.write(85); 
                // Escreve "N" para o buffer writer 
		buffWriter.write(78); 
		// Escreve "I" para o buffer writer 
		buffWriter.write(73); 
		// Write "V" to buffer writer 
		buffWriter.write(86); 
		// Write "E" to buffer writer 
		buffWriter.write(69); 
		// Write "S" to buffer writer 
		buffWriter.write(83); 
		// Write "P" to buffer writer 
		buffWriter.write(80); 

                buffWriter.flush(); 

		System.out.println( 
			stringWriter.getBuffer()); 
	} 
} 

