package exercicio5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PreEPosCondicoesDaClasse {
	
	@BeforeClass // Método estático -> preCondição Antes da classe
	public static void preCondicao_AntesClasse() {
		System.out.println("Executou antes de todos os testes");
	}
		
	
	@Before
	public void preCondicao() {
		System.out.println("Executou a pre condicao");
	}
	
	@Test //método de teste
	public void exibicaoPrePosCondicao_Teste1() {
		System.out.println("Executou o Teste 1"); // saída de console.
	}

	@Test
	public void exibicaoPrePosCondicao_Teste2() {
	System.out.println("Executou o teste 2");
	}

	@After // método de pós Condição
	public void posCondicao() {
		System.out.println("Executou  apos condicao");
	}
	
	@AfterClass // Método estático pósCondição -> Depois dos testes
	public static void posCondicao_DepoisClasse() {
		System.out.println("Executou depois de todos os testes");
	}
	
}
