package exemploexcept1;

import java.io.*;

public class ExemploExcept1 {

   public static void main(String args[]) 
   {
	FileInputStream fis = null;
        fis = new FileInputStream("C:/meuarquivo.txt"); 
	int k; 

	while(( k = fis.read() ) != -1) 
	{ 
		System.out.print((char)k); 
	} 

	fis.close(); 	
   }
}
