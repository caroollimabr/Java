
public class TesteFuncionario {
	 public static void main(String[] args) {

		 //Classes abstratas não são instanciadas. Para instanciar, criamos uma classe filha não abstrata.
		 //filho concreto (Gerente) da classe Funcionario
         Gerente carolina = new Gerente();//referencia = new objeto()
         carolina.setNome("Carolina Lima");
         carolina.setCpf("111.111.111-11");

         System.out.println(carolina.getNome());
         System.out.println(carolina.getBonificacao());

         

 }
}
