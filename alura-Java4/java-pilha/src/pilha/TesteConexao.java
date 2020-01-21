package pilha;
//TRY CATCH DE FORMA MAIS ENXUTA
public class TesteConexao {
	public static void main(String[] args) {

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conex�o");
		}

		/* (NESSE CASO, O FINALLY � CRIADO AUTOMATICAMENTE)
		 * finally { -- bloco opcional que sempre ser� executado, com ou sem erro
		 * System.out.println("finally"); 
		 * if(conexao != null) { 
		 * 	con.close(); 
		 * }
		 * }
		 */
		
		
		//OUTRA OP��O MAIS VERBOSA
		
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//		} finally {
//			System.out.println("finally");
//			if(con != null) {
//				con.close();
//			}
//		}

	}
}

//try sozinho NUNCA!
// try e catch (captura a exce��o e a trata) OU try e finally (n�o captura nada)
