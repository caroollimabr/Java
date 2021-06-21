package exemplothrow;

import java.io.IOException;

class TesteThrow { 
  void meuMetodo(int num)throws IOException, ClassNotFoundException{ 
     if(num==1)
        throw new IOException("Ocorreu IOException!");
     else
        throw new ClassNotFoundException("ClassNotFoundException");
  } 
} 

public class ExemploThrow{ 
  public static void main(String args[]){ 
   try{ 
     TesteThrow obj=new TesteThrow(); 
     obj.meuMetodo(1); 
   }catch(Exception ex){
     System.out.println(ex);
    } 
  }
}
