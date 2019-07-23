package exercicio4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PreEPosCondicoesDeTeste {
	
	@Before // Pré condição do Teste 
	public void preCondicao() { // método preCondição
		System.out.println("Executou a pre condicao");
	}
	
	@Test
	public void exibicaoPrePosCondicao_Teste1() {
		System.out.println("Executou o Teste 1");
	}
	
	@Test
	public void exibicaoPrePosCondicao_Teste2() {
		System.out.println("Executou o Teste 2");
	}
	
	@After // pós condição
	public void posCondicao() { // método posCondicao
		System.out.println("Executou a pos condicao");
	}

}
