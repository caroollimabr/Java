package negocio;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe de teste criada para garantir o funcionamento das principais opera��es
 * sobre clientes, realizadas pela classe {@link GerenciadoraClientes}.
 * 
 */
public class GerenciadoraClientesTest_Ex8 {

	private GerenciadoraClientes gerClientes;
	private int idCLiente01 = 1;
	private	int idCLiente02 = 2;
	
	@Before
	public void setUp() {
	
		/* ========== Montagem do cen�rio ========== */
		
		// criando alguns clientes
		Cliente cliente01 = new Cliente(idCLiente01, "Fulano de Tal", 31, "fulanodetal@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(idCLiente02, "Sicrano Beltrano", 34, "sicranobeltrano@gmail.com", 1, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		gerClientes = new GerenciadoraClientes(clientesDoBanco);
	
		// a) Abriu conex�o com o BD? Ent�o...
		// b) Criou arquivos e pastas aqui? Ent�o...
		// c) Inseriu clientes fict�cios na base de dados especificamente para os testes desta classe? Ent�o...
	}

	@After
	public void tearDown() { //� importante para que a sujeira causada pelos testes seja limpa para n�o quebrar os outros testes
		gerClientes.limpa();
		
		// a) Fecha aqui!!!
		// b) Apaga todos eles aqui!!!
		// c) Apaga eles aqui!!!
	}
	
	/**
	 * Teste b�sico da pesquisa de um cliente a partir do seu ID.
	 * 
	 */
	@Test
	public void testPesquisaCliente() {

		/* ========== Execu��o ========== */
		Cliente cliente = gerClientes.pesquisaCliente(idCLiente01);
		
		/* ========== Verifica��es ========== */
		assertThat(cliente.getId(), is(idCLiente01));
		
	}
	
	/**
	 * Teste b�sico da remo��o de um cliente a partir do seu ID.
	 * 
	 */
	@Test
	public void testRemoveCliente() {
		
		/* ========== Execu��o ========== */
		boolean clienteRemovido = gerClientes.removeCliente(idCLiente02);
		
		/* ========== Verifica��es ========== */
		assertThat(clienteRemovido, is(true));
		assertThat(gerClientes.getClientesDoBanco().size(), is(1));
		assertNull(gerClientes.pesquisaCliente(idCLiente02));
		
	}
	
}
// A Independ�ncia do Teste