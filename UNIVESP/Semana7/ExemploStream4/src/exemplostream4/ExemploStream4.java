package exemplostream4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExemploStream4 { 
    public static void main(String[] args) throws FileNotFoundException, IOException 
    { 
  
        // Lê a stream  
        FileReader fileReader 
            = new FileReader("C://Users//julio//entrada.txt"); 
  
        // Converte fileReader para bufferedReader 
        BufferedReader buffReader 
            = new BufferedReader( 
                fileReader); 
  
        while (buffReader.ready()) { 
            // Lê e imprime caraacteres um a um  
            System.out.println("Caractere :" + (char)buffReader.read()); 
        } 
    } 
} 
