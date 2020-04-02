package pilha;
//TRY CATCH DE FORMA MAIS ENXUTA
public class TesteConexao {
	public static void main(String[] args) {

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}

		/* (NESSE CASO, O FINALLY É CRIADO AUTOMATICAMENTE)
		 * finally { -- bloco opcional que sempre será executado, com ou sem erro
		 * System.out.println("finally"); 
		 * if(conexao != null) { 
		 * 	con.close(); 
		 * }
		 * }
		 */
		
		
		//OUTRA OPÇÃO MAIS VERBOSA
		
		
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
// try e catch (captura a exceção e a trata) OU try e finally (não captura nada)
