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
public class GerenciadoraClientesTest_Ex10 {

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
	}

	@After
	public void tearDown() {
		gerClientes.limpa();
	}
	
	/**
	 * Teste b�sico da pesquisa de um cliente a partir do seu ID.
	 */
	@Test
	public void testPesquisaCliente() {

		/* ========== Execu��o ========== */
		Cliente cliente = gerClientes.pesquisaCliente(idCLiente01);
		
		/* ========== Verifica��es ========== */
		assertThat(cliente.getId(), is(idCLiente01));
		
	}
	
	/**
	 * Teste b�sico da pesquisa por um cliente que n�o existe.
	 */
	@Test
	public void testPesquisaClienteInexistente() {

		/* ========== Execu��o ========== */
		Cliente cliente = gerClientes.pesquisaCliente(1001);
		
		/* ========== Verifica��es ========== */
		assertNull(cliente);
		
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
	
	/**
	 * Teste da tentativa de remo��o de um cliente inexistente.
	 * 
	 */
	@Test
	public void testRemoveClienteInexistente() {

	
		/* ========== Execu��o ========== */
		boolean clienteRemovido = gerClientes.removeCliente(1001);
		
		/* ========== Verifica��es ========== */
		assertThat(clienteRemovido, is(false));
		assertThat(gerClientes.getClientesDoBanco().size(), is(2));
		
	}
	
	/**
	 * Valida��o da idade de um cliente quando a mesma est� no intervalo permitido.
	 * 
	 * @throws IdadeNaoPermitidaException 
	 */
	@Test
	public void testClienteIdadeAceitavel() throws IdadeNaoPermitidaException {

		/* ========== Montagem do Cen�rio ========== */		
		Cliente cliente = new Cliente(1, "Fulano", 25, "fulano@gmail.com", 1, true);
		
		/* ========== Execu��o ========== */
		boolean idadeValida = gerClientes.validaIdade(cliente.getIdade());
		
		/* ========== Verifica��es ========== */
		assertTrue(idadeValida);	
	}
	
	/**
	 * Valida��o da idade de um cliente quando a mesma est� no intervalo permitido.
	 * 
	 * @throws IdadeNaoPermitidaException 
	 */
	@Test
	public void testClienteIdadeAceitavel_02() throws IdadeNaoPermitidaException {

		/* ========== Montagem do Cen�rio ========== */		
		Cliente cliente = new Cliente(1, "Fulano", 18, "fulano@gmail.com", 1, true);
		
		/* ========== Execu��o ========== */
		boolean idadeValida = gerClientes.validaIdade(cliente.getIdade());
		
		/* ========== Verifica��es ========== */
		assertTrue(idadeValida);	
	}
	
	/**
	 * Valida��o da idade de um cliente quando a mesma est� no intervalo permitido.
	 * 
	 * @throws IdadeNaoPermitidaException 
	 */
	@Test
	public void testClienteIdadeAceitavel_03() throws IdadeNaoPermitidaException {

		/* ========== Montagem do Cen�rio ========== */		
		Cliente cliente = new Cliente(1, "Fulano", 65, "fulano@gmail.com", 1, true);
		
		/* ========== Execu��o ========== */
		boolean idadeValida = gerClientes.validaIdade(cliente.getIdade());
		
		/* ========== Verifica��es ========== */
		assertTrue(idadeValida);	
	}
	
	/**
	 * Valida��o da idade de um cliente quando a mesma est� abaixo intervalo permitido.
	 * 
	 * @throws IdadeNaoPermitidaException 
	 */
	@Test
	public void testClienteIdadeAceitavel_04() throws IdadeNaoPermitidaException {

		/* ========== Montagem do Cen�rio ========== */		
		Cliente cliente = new Cliente(1, "Fulano", 17, "fulano@gmail.com", 1, true);

		/* ========== Execu��o ========== */
		try {
			gerClientes.validaIdade(cliente.getIdade());
			fail();
		} catch (Exception e) {
			/* ========== Verifica��es ========== */
			assertThat(e.getMessage(), is(IdadeNaoPermitidaException.MSG_IDADE_INVALIDA));
		}	
	}
	
	/**
	 * Valida��o da idade de um cliente quando a mesma est� acima intervalo permitido.
	 * 
	 * @throws IdadeNaoPermitidaException 
	 */
	@Test
	public void testClienteIdadeAceitavel_05() throws IdadeNaoPermitidaException {
		
		/* ========== Montagem do Cen�rio ========== */		
		Cliente cliente = new Cliente(1, "Fulano", 66, "fulano@gmail.com", 1, true);
		/* ========== Execu��o ========== */
		try {
			gerClientes.validaIdade(cliente.getIdade());
			fail();
		} catch (Exception e) {
			/* ========== Verifica��es ========== */
			assertThat(e.getMessage(), is(IdadeNaoPermitidaException.MSG_IDADE_INVALIDA));
		}	
	}
	
}

// Valores Limites