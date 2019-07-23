package exercicio6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import exercicio1.MeuPrimeiroTeste;
import exercicio2.ValidacaoVerdadeiroFalso;
import exercicio3.ValidacaoIgualdade;
import exercicio4.PreEPosCondicoesDeTeste;
import exercicio5.PreEPosCondicoesDaClasse;

@RunWith(Suite.class) //Dispara diversos testes e deve conter o parâmetro (Suite.class)
@SuiteClasses({ //Informar os testes a serem executados e deve conter como parâmetros a lista de classes de testes que serão executados.
	MeuPrimeiroTeste.class,
	ValidacaoVerdadeiroFalso.class,
	ValidacaoIgualdade.class,
	PreEPosCondicoesDeTeste.class, //extensão .class deve estarem separadas por vírgula.
	PreEPosCondicoesDaClasse.class
})
public class SuiteDeTeste {

	
}
