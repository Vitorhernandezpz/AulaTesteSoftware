package sistemabancario;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClienteTeste {
	
	@Test
	public void testPesquisaClient(){
		
		//criando clientes
		Cliente cliente01 = new Cliente(1, "Vitor", 24, "vitorhp@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Joao", 60, "joao@gmail.com", 2, true);
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(cliente01);
		clientes.add(cliente02);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientes);
		
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		assertThat(cliente.getId(), is(1)); // Responsavel por mandar a mensagem pro junit. 
		assertThat(cliente.getEmail(), is("vitorhp@gmail.com"));;
	}
}
