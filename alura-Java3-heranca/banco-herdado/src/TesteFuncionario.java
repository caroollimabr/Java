
public class TesteFuncionario {
	 public static void main(String[] args) {

		 //Classes abstratas n�o s�o instanciadas. Para instanciar, criamos uma classe filha n�o abstrata.
		 //filho concreto (Gerente) da classe Funcionario
         Gerente carolina = new Gerente();//referencia = new objeto()
         carolina.setNome("Carolina Lima");
         carolina.setCpf("111.111.111-11");

         System.out.println(carolina.getNome());
         System.out.println(carolina.getBonificacao());

         

 }
}
