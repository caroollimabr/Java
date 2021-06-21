package exemploexcept5;

public class ExemploExcept5 {
   public static void main(String args[]) {
      int result, num1, num2;
      try {
         /* Suspeitamos que este bloco de declarações pode lançar exceção, 
         então tratamos disso colocando essas instruções dentro de try e manipulamos a exceção no bloco catch */
         num1 = 0;
         num2 = 25;
         result = num2/num1;
         System.out.println(result);
         System.out.println("Estou no bloco try");
      }
      catch (ArithmeticException e) { 
         /* Somente vai executar se ocorrer Arithmetic exception 
          * no bloco try
          */
         System.out.println("Divisão por zero não permitida!");
      }
      finally{
	 System.out.println("Este é o bloco finally");
      }  
      System.out.println("Fora do bloco try/catch/finally");
   }
}
