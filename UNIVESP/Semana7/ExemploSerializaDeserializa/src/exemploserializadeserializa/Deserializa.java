package exemploserializadeserializa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializa
{
   public static void main(String [] args)
   {
      Funcionario e;
      try
      {
          try (FileInputStream fileIn = new FileInputStream("C://Users//julio//funcionario.ser"); 
                  ObjectInputStream in = new ObjectInputStream(fileIn)) {
              e = (Funcionario) in.readObject();
          }
      }catch(IOException i)
      {
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("Classe Funcionario não encontrada!");
         return;
      }
      System.out.println("Funcionario desserializado...");
      System.out.println("Nome: " + e.nome);
      System.out.println("Endereco: " + e.endereco);
      System.out.println("ID: " + e.id);
      System.out.println("Numero: " + e.numero);
    }
}