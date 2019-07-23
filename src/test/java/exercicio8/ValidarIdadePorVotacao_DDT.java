package exercicio8;


import votacao.Votacao;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;


import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_DDT {
	/*Atributos Globais*/
	String nome;
	int anoDeNascimento;
	String resultado;
	
	public ValidarIdadePorVotacao_DDT(String nome, int anoDeNascimento, String resultado) {
		this.nome = nome;
		this.anoDeNascimento = anoDeNascimento;
		this.resultado = resultado;
	}
	
	@Test
	public void ValidarObrigatoriedadeDeVoto() {
		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Parameters( name = "{0} | {1} | {2} ")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{ "Lucio", 2004, "Lucio voce nao pode votar"},
			{ "Maria", 2004, "Maria voce nao pode votar" },
			{ "Rodrigo", 2002, "Rodrigo seu voto e facultativo" },
			{ "Joao", 2002, "Joao seu voto e facultativo" },
			{ "Carla", 2000, "Carla seu voto e obrigatorio" },
			{ "Jose", 1993, "Jose seu voto e obrigatorio" },
			{ "Ana", 1949, "Ana seu voto e obrigatorio" },
			{ "Pedro", 1948, "Pedro seu voto e facultativo" }
			
		});
	}
	
		
}
