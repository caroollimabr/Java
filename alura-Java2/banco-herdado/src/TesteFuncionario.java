
public class TesteFuncionario {
	 public static void main(String[] args) {

         Funcionario carolina = new Funcionario();//referencia = new objeto()
         carolina.setNome("Carolina Lima");
         carolina.setCpf("111.111.111-11");
         carolina.setSalario(6000.00);

         System.out.println(carolina.getNome());
         System.out.println(carolina.getBonificacao());

         

 }
}
