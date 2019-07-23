package exercicio3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidacaoIgualdade {
	
	@Test
	public void validacaoIgualdade_Sucesso() {
		String resultadoObtido = "Registro salvo com sucesso!";
		assertEquals("Registro salvo com sucesso!", resultadoObtido);
	
	}
	
	@Test
	public void validacaoIgualdade_falha() {
		String resultadoObtido = "Registro excluido com sucesso!";
		assertEquals("Regitro salvo com sucesso!", resultadoObtido);
	}
}
