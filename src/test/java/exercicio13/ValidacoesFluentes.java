package exercicio13;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class ValidacoesFluentes {

	@Test
	public void ValidacaoEqualsTo() {
		String produto = "Tv 40 polegadas";
		assertThat(produto, equalTo("Tv 40 polegadas"));
	}
	
	@Test
	public void validacaoIs() {
		int codigo = 50;
		assertThat(codigo, is(50));
	}
	
	@Test
	public void validaAnyOf() {
		String resultadoObtido = "A cor selecionada foi vermelha.";
		assertThat(resultadoObtido, 
				anyOf(containsString("vermelho"), containsString("vermelha")));
	}
	
	@Test
	public void validacaoHasItems() {
		java.util.List<String> listaProdutos = new ArrayList<String>();
		listaProdutos.add("iPhone 8 Plus 64 GB");
		listaProdutos.add("Adaptador USB-C VGA");
		listaProdutos.add("Apple TV 4 geracao");
		
		assertThat(listaProdutos, hasItem("Adaptador USB-C VGA"));
	}
	
	
	
	
	
	
	
	
	
}
